package com.example.dsasolutions.Arrays;

public class RemoveDuplicate {

    public static int removeDuplicateItem(int[] nums) {

        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        for(int k : nums){
            System.out.println("elements " + k);
        }
        return insertIndex;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8};

        int k = removeDuplicateItem(nums);

        System.out.println("K Elements " + k);
    }
}
