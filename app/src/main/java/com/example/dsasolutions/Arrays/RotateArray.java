package com.example.dsasolutions.Arrays;

public class RotateArray {

    public static void rotateArrayToRight(int[] nums, int m) {
        int n = nums.length;
        int k = m % n;
        reverseTheArray(nums, 0, n - 1);
        reverseTheArray(nums, 0, k - 1);
        reverseTheArray(nums, k, n - 1);
        printArray(nums);
    }
    public static void printArray(int[] numbers){

        for (int number : numbers) {
            System.out.println("  " + number);
        }
    }

    public static void reverseTheArray(int[] numb, int start, int end) {
        while (start < end) {
            int temp = numb[start];
            numb[start] = numb[end];
            numb[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        rotateArrayToRight(nums, k);
    }
}
