package com.company.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        System.out.println(linearSearch(intArray, 54));
        System.out.println(linearSearch(intArray, 76));
        System.out.println(linearSearch(intArray, 43));
        System.out.println(linearSearch(intArray, 46));
    }

    private static int linearSearch(int[] intArray, int i) {
        for (int j = 0; j < intArray.length; j++) {
            if (i == intArray[j])
                return j;
        }
        return -1;
    }
}
