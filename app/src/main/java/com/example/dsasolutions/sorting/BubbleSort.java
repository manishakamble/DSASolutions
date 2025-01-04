package com.example.dsasolutions.sorting;

public class BubbleSort {
    public static int heightChecker(int[] heights) {

        int[] original = heights.clone();
        boolean swapped = true ;

        int heightChk = 0;

        while(swapped){
            swapped = false;
            for(int i = 0 ; i < heights.length - 1  ; i++) {
                if(heights[i] > heights[i + 1]){
                    int temp = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = temp ;
                    swapped = true;
                }
            }
        }
       // printArray(heights);
       // printArray(original);

        for(int j = 0 ; j < heights.length ; j++ ){

            if(original[j] != heights[j]){
                heightChk++;
            }
        }
        return heightChk;
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print("  " + i);
        }
    }
    public static void main(String[] args){

        int[] arr = new int[]{3, 5, 1, 98, 34, 21, 2, 4};
        int value = heightChecker(arr);
        System.out.println("Result ------ >" +value);
    }
}
