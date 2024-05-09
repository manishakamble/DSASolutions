package com.example.dsasolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximizeHappiness {

    public static long maximumHappinessSum(int[] happiness, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < happiness.length; i++) {
            pq.add(i);
        }
        long totalHappiness = 0;
        int turns = 0;

        for (int j = 0; j < k; j++) {
            totalHappiness += Math.max(pq.poll() - turns, 0);
            turns++;
        }
        return totalHappiness;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3};
        int k = 2;
        int res = (int) maximumHappinessSum(arr, k);
        System.out.println("Result -----> " + res);
    }
}

//Time complexity: O(n⋅log⁡n+k⋅log⁡n)O(n \cdot \log n + k \cdot \log n)O(n⋅logn+k⋅logn)

// Space complexity: O(n)