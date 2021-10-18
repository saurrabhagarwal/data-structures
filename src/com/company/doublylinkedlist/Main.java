package com.company.doublylinkedlist;

import com.company.linkedlist.Employee;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());

        list.addToFront(janeJones);
        list.addToFront(jhonDoe);
        list.addToFront(marrySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
    }
}
