package com.company.stacks;

import com.company.linkedlist.Employee;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        ArrayStack arrayStack = new ArrayStack(10);
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.size());

        arrayStack.push(janeJones);
        arrayStack.push(jhonDoe);
        arrayStack.push(marrySmith);
        arrayStack.push(mikeWilson);

        System.out.println(arrayStack.size());
        arrayStack.printStack();

        arrayStack.pop();

        System.out.println(arrayStack.size());
        arrayStack.printStack();

        Employee billEnd = new Employee("Bill", "End", 78);
        arrayStack.push(billEnd);
        System.out.println(arrayStack.size());
        arrayStack.printStack();

        arrayStack.pop();
        System.out.println(arrayStack.size());
        arrayStack.printStack();
        System.out.println(arrayStack.peek());
    }
}
