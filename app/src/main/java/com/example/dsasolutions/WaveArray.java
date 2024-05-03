package com.example.dsasolutions;

import java.util.Arrays;

public class WaveArray {

    // utility method to swap the two numbers
    void swapElement(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortInWave(int arr[], int len) {
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i += 2) {
            swapElement(arr, i, i + 1);
        }
    }


    public static void main(String arr[]) {
        WaveArray object = new WaveArray();
        int inputArray[] = {10, 90, 49, 2, 1, 5, 23};
        //int inputArray[] = {1,2,3,4,5,6,7,8,9};
        int n = inputArray.length;
        object.sortInWave(inputArray, n);
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
    }
}
