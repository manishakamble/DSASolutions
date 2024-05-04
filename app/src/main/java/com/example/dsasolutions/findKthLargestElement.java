package com.example.dsasolutions;

import java.util.PriorityQueue;

public class findKthLargestElement {
    public static void findLargestElement(int arr[], int N, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(arr[i]);
            if (pq.size() > K) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int n = arr.length;
        int k = 3;
        findLargestElement(arr, n, k);
    }
}
