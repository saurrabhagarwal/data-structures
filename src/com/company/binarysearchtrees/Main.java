package com.company.binarysearchtrees;

public class Main {
    public static void main(String[] args) {

        // insertion -> traversal -> Get, Min, Max
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();
        System.out.println();

        System.out.println(tree.get(25));
        System.out.println(tree.get(27));
        System.out.println(tree.get(7999));

        System.out.println("min = " + tree.min());
        System.out.println("max = " + tree.max());

        tree.delete(25);
        tree.traverseInOrder();
        System.out.println();
    }
}
