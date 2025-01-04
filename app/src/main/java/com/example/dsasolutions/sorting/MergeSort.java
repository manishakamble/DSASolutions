package com.example.dsasolutions.sorting;

import static com.example.dsasolutions.MergeIntervals.merge;

public class MergeSort {

    public static int heightChecker(int[] heights) {
        int[] sortedArr = heights.clone();
        int[] tempArr = new int[heights.length];
        mergeSort(sortedArr, 0, heights.length - 1, tempArr);
        int count = 0;
        for (int i = 0; i < sortedArr.length; i++) {
            if (heights[i] != sortedArr[i]) {
                count += 1;
            }
        }
        return count;
    }

    private static void mergeSort(int[] sortedArr, int left, int right, int[] tempArr) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(sortedArr, left, mid, tempArr);
        mergeSort(sortedArr, mid + 1, right, tempArr);
        merge(sortedArr, left, mid, right, tempArr);

    }

    public static void merge(int[] arr, int left, int mid, int right, int[] tempArr) {
      int start1 = left;
      int start2 = mid + 1;
      int n1 = mid - left + 1;
      int n2 = right - mid ;
        // Copy elements of both halves into a temporary array.
        for (int i = 0; i < n1; i++) {
            tempArr[start1 + i] = arr[start1 + i];
        }
        for (int i = 0; i < n2; i++) {
            tempArr[start2 + i] = arr[start2 + i];
        }

        // Merge the sub-arrays in 'tempArray' back into the original array 'arr' in
        // sorted order.
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (tempArr[start1 + i] <= tempArr[start2 + j]) {
                arr[k] = tempArr[start1 + i];
                i += 1;
            } else {
                arr[k] = tempArr[start2 + j];
                j += 1;
            }
            k += 1;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = tempArr[start1 + i];
            i += 1;
            k += 1;
        }
        while (j < n2) {
            arr[k] = tempArr[start2 + j];
            j += 1;
            k += 1;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 98, 34, 21, 2, 4};
        int count = heightChecker(arr);
        System.out.println("Result " + count);
    }


}
