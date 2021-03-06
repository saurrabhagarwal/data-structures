package com.company.stacks;

import com.company.linkedlist.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // resize
            Employee[] newArray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty())
            throw new EmptyStackException();
        Employee removed = stack[--top];
        stack[top] = null;
        return removed;
    }

    public Employee peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top-1; i >=0 ; i--) {
            System.out.println(stack[i]);
        }
    }
}
