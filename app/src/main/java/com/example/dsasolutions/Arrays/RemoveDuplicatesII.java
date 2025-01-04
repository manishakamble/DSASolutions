package com.example.dsasolutions.Arrays;

public class RemoveDuplicatesII {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        int i = 1;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] == nums[i - 1]) {
                count++;
            }else {
                count = 1;
            }
            if(count <= 2){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] num = new int[]{1, 1, 1, 2, 2, 3, 3, 3, 4};

        int ans = removeDuplicates(num);

        System.out.println("length of array : " + ans);
    }
}
