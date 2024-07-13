package com.example.dsasolutions.sorting;

import java.util.HashMap;

public class selectionSort {

    public static void sortArray(int[] arr) {
        int min ;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // swap current element to min value
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
    public static void printArray(int[] array){

        for (int i : array) {
            System.out.print("  " + i);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 1, 98, 34, 21, 2, 4};
        sortArray(arr);
    }
}


