package com.company.stacks;

import com.company.linkedlist.Employee;

public class LinkedStackMain {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        LinkedStack linkedStack = new LinkedStack();
        System.out.println(linkedStack.isEmpty());
        System.out.println(linkedStack.size());

        linkedStack.push(janeJones);
        linkedStack.push(jhonDoe);
        linkedStack.push(marrySmith);
        linkedStack.push(mikeWilson);

        System.out.println(linkedStack.size());
        linkedStack.printStack();

        linkedStack.pop();

        System.out.println(linkedStack.size());
        linkedStack.printStack();

        Employee billEnd = new Employee("Bill", "End", 78);
        linkedStack.push(billEnd);
        System.out.println(linkedStack.size());
        linkedStack.printStack();

        linkedStack.pop();
        System.out.println(linkedStack.size());
        linkedStack.printStack();
        System.out.println(linkedStack.peek());
    }
}
