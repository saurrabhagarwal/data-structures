package com.company.linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        EmployeeLinkedList list = new EmployeeLinkedList();
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
    }
}
