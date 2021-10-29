package com.company.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-54, -46, 0, 66, 95, 192, 431};

        System.out.println("index = " + binarySearch(intArray, -54));
        System.out.println("index = " + binarySearch(intArray, 66));
        System.out.println("index = " + binarySearch(intArray, 431));
        System.out.println("index = " + binarySearch(intArray, 486));
        System.out.println("-----------------------------------------");
        System.out.println("index = " + recursiveBinarySearch(intArray, -54));
        System.out.println("index = " + recursiveBinarySearch(intArray, 66));
        System.out.println("index = " + recursiveBinarySearch(intArray, 431));
        System.out.println("index = " + recursiveBinarySearch(intArray, 486));
    }

    private static int binarySearch(int[] intArray, int value) {
        int start = 0;
        int end = intArray.length;
        while (start < end) {
            int mid = (start + end) / 2;
            System.out.print("mid = " + mid + " ");
            if (intArray[mid] == value)
                return mid;
            else if (intArray[mid] < value)
                start = mid + 1;
            else
                end = mid;

        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] intArray, int value) {
        return recursiveBinarySearch(intArray, 0, intArray.length, value);
    }

    private static int recursiveBinarySearch(int[] intArray, int start, int end, int value) {
        if (start >= end)
            return -1;
        int mid = (start + end) / 2;
        System.out.print("mid = " + mid + " ");
        if (intArray[mid] == value)
            return mid;
        else if (intArray[mid] < value)
            return recursiveBinarySearch(intArray, mid + 1, intArray.length, value);
        else
            return recursiveBinarySearch(intArray, start, mid, value);
    }
}
