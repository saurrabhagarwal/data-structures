package com.company.heaps;

public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull())
            throw new IndexOutOfBoundsException("Heap is full");
        heap[size] = value;
        // heapify the heap after insert
        fixHeapAbove(size);
        size++;
    }

    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is Empty");
        return heap[0];
    }

    public void printHeap() {
        for (int i = 0; i < heap.length; i++) {
            System.out.printf(heap[i] + " , ");
        }
        System.out.println();
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

}
