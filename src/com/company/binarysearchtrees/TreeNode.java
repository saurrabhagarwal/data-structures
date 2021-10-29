package com.company.binarysearchtrees;

public class TreeNode {
    private int data;
    private com.company.binarysearchtrees.TreeNode leftChild;
    private com.company.binarysearchtrees.TreeNode rightChild;

    public void insert(int value) {
        if (value == data)
            return;                 // Duplicates not allowed
        if (value < data) {
            if (leftChild == null)
                leftChild = new com.company.binarysearchtrees.TreeNode(value);
            else
                leftChild.insert(value);
        } else {
            if (rightChild == null)
                rightChild = new com.company.binarysearchtrees.TreeNode(value);
            else
                rightChild.insert(value);
        }
    }

    // in order traversal, gives sorted output---left, root, right
    public void traverseInOrder() {
        if (leftChild != null)
            leftChild.traverseInOrder();

        System.out.print( data + " , ");

        if (rightChild != null)
            rightChild.traverseInOrder();
    }

    public com.company.binarysearchtrees.TreeNode get(int value) {
        if (data == value)
            return this;
        if (value > data)
            if (rightChild != null)
                return rightChild.get(value);
            else if (leftChild != null)
                return leftChild.get(value);

        return null;
    }

    public int min() {
        if (leftChild == null)
            return data;
        else
            return leftChild.min();
    }

    public int max() {
        if (rightChild == null)
            return data;
        else
            return rightChild.max();
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public com.company.binarysearchtrees.TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(com.company.binarysearchtrees.TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public com.company.binarysearchtrees.TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(com.company.binarysearchtrees.TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Data =  " + data;
    }

}
