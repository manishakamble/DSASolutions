package com.example.dsasolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* As the input array nums is sorted ascending and all the elements in it are within the given [lower, upper] bounds,
*  we can simply check consecutive elements to see if they differ by one or not.
* If they don't, then we have found a missing range.
When nums[i + 1] - nums[i] <= 1, we know that there are no missing elements between nums[i + 1] and nums[i].
When nums[i + 1] - nums[i] > 1, we know that the range of elements, [nums[i] + 1, nums[i + 1] - 1], is missing.
However, there are two edge cases:
if we don't start with lower as the first element of the array,
* we will need to include [lower, num[0] - 1] as a missing range as well.
Similarly,
*  if we don't end with upper as the last element of the array,
* we will need to include [nums[n - 1] + 1, upper] as a missing range as well where n is the length of nums.*/

public class MissingRange {

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {

        int n = nums.length;

        List<List<Integer>> missingRange = new ArrayList<>();

        if (n == 0) {
            missingRange.add(Arrays.asList(lower, upper));
        } else {
            if (nums[0] > lower) {
                missingRange.add(Arrays.asList(lower, nums[0] - 1));
            }
            for (int i = 0; i < n - 1; i++) {

                if (nums[i + 1] - nums[i] > 1) {

                    missingRange.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
                }
            }
            if (upper > nums[n - 1]) {
                missingRange.add(Arrays.asList(nums[n - 1] + 1, upper));
            }
        }

        return missingRange;
    }

    public static void main(String args[]) {

        int nums[] = {0, 1, 3, 50, 75}, lower = 0, upper = 99;

        System.out.println("Ranges : " + findMissingRanges(nums, lower, upper));

    }
}
