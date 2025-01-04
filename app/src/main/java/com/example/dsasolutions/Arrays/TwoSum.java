package com.example.dsasolutions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    public static int[] twoSum(int[] numArray, int target) {

        Map<Integer, Integer> mapCollection = new HashMap<>();
        for (int i = 0; i < numArray.length; i++) {
             int otherIndices = target - numArray[i];
             if(mapCollection.containsKey(otherIndices)){
                 return new int[]{mapCollection.get(otherIndices), i};
             }
            mapCollection.put(numArray[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] inputArray =  new int[] {11,15,2,7};
        int target = 9 ;
        int[] ans =  twoSum(inputArray,target);
        System.out.println("1st indice - > " + ans[0] +" 2nd Indices : "+ans[1]);
    }
    /*
      Time complexity: O(n).
     We traverse the list containing n elements only once. Each lookup in the table costs only O(1) time.

    Space complexity: O(n).
    The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
    * */
}
