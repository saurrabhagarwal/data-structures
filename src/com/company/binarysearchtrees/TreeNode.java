package com.company.binarysearchtrees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value) {
        if (value == data)
            return;                 // Duplicates not allowed
        if (value < data) {
            if (leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);
        } else {
            if (rightChild == null)
                rightChild = new TreeNode(value);
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

    public TreeNode get(int value) {
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

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Data =  " + data;
    }

}
