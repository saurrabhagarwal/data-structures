package com.company.bubketsort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
            buckets[i] = new ArrayList<>();
            //buckets[i] = new LinkedList<>();
            //buckets[i] = new Vector<>();
        }
    }

    private static int hash(int value) {
        return value / 10 % 10;    //10 = buckets length
    }
}
