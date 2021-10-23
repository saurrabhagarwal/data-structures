package com.company.queues;

import com.company.linkedlist.Employee;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        System.out.println("------------Array Queue---------");
        ArrayQueue arrayQueue = new ArrayQueue(10);
        System.out.println(arrayQueue.size());

        arrayQueue.add(janeJones);
        arrayQueue.add(jhonDoe);
        arrayQueue.add(marrySmith);
        arrayQueue.add(mikeWilson);

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        System.out.println("removed ---- " + arrayQueue.remove());

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        Employee billEnd = new Employee("Bill", "End", 78);
        arrayQueue.add(billEnd);
        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        System.out.println("removed ---- " + arrayQueue.remove());
        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();
        System.out.println("peek  ----" + arrayQueue.peek());
    }
}
