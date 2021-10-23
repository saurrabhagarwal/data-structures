package com.company.hashtables;

import com.company.linkedlist.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    public LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key))
                return employee.value;
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key))
                break;
        }
        if (employee == null || !employee.key.equals(key))
            return null;
        else {
            hashTable[hashedKey].remove(index);
            return employee.value;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i].isEmpty())
                System.out.println("Position " + i + " : Empty");
            else {
                System.out.print("Position " + i + " : ");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().value + " -> ");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
}
