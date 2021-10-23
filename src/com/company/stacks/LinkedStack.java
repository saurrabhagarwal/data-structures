package com.company.stacks;

import com.company.linkedlist.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        Iterator<Employee> itr = stack.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
