package com.company.doublylinkedlist;

import com.company.linkedlist.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        node.setNext(head);
        if (head == null)
            tail = node;
        else
            head.setPrevious(node);
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        node.setPrevious(tail);
        if (tail == null)
            head = node;
        else
            tail.setNext(node);
        tail = node;
        size++;
    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty())
            return null;
        EmployeeDoublyNode removedNode = head;
        head = head.getNext();
        if (head.getNext() == null)
            tail = null;
        head.setPrevious(null);
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty())
            return null;
        EmployeeDoublyNode removedNode = tail;
        tail = tail.getPrevious();
        if (tail.getPrevious() == null)
            head = null;
        tail.setNext(null);
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD ->");
        while (current != null) {
            System.out.print(current + " <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
