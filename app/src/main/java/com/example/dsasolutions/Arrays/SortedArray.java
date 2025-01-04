package com.example.dsasolutions.Arrays;

public class SortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for(int i = nums1.length - 1; i >= 0; i--) {
            if(p1 >= 0 && p2 >= 0) {
                nums1[i] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            } else if (p1 >= 0) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
        for (int i : nums1) {
            System.out.println("elements " + i);
        }
    }

    public static void main(String[] args) {

        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};

        int[] num2 = new int[]{2, 5, 6};

        SortedArray.merge(num1,3, num2, num2.length);
        System.out.println("len " +num2.length);
    }
}
