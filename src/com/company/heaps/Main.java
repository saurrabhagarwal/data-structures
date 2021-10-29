package com.company.heaps;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(2);
        heap.insert(10);
        heap.insert(40);
        heap.insert(70);
        heap.insert(60);
        heap.insert(6);
        heap.insert(76);
        heap.insert(7);

        heap.printHeap();
        
        heap.peek();

    }
}
