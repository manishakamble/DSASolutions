package com.example.dsasolutions;

import java.util.Arrays;
import java.util.HashMap;

public class KeyPairOrTwoSum {

    public static int[] twoSum(int[] nums, int target, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                arr[0] = i;
                arr[1] = map.get(nums[i]);
                return arr;
            } else {
                map.put(target - nums[i], i);
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4};
        int n = arr.length;
        int target = 6;
        System.out.println("the sum pair ---" + Arrays.toString(twoSum(arr, target, n)));
    }
}
