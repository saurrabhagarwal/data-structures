package com.company.hashtables;

import com.company.linkedlist.Employee;
import com.company.linkedlist.EmployeeLinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 124);
        Employee marrySmith = new Employee("Marry", "Smith", 125);
        Employee mikeWilson = new Employee("Mike", "Wilson", 126);

        SimpleHashTable hashTable = new SimpleHashTable();
        System.out.println("-----------Simple HashTable-------");
        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", jhonDoe);
        hashTable.put("Smith", marrySmith);
        hashTable.put("Wilson", mikeWilson);

        hashTable.printHashTable();

        System.out.println("retrieved -- " + hashTable.get("Jones"));
    }
}
