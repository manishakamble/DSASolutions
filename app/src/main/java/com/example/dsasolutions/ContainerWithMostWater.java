package com.example.dsasolutions;

public class ContainerWithMostWater {

    public static int maxArea(int[] ht){

        int left = 0 ; int right = ht.length - 1;

        int maxArea = 0;

        while (left < right){

            int width = right - left;
            int minHeight = Math.min(ht[left], ht[right]);
            int calculateArea = width * minHeight;
            maxArea = Math.max(maxArea , calculateArea);

            if(ht[left] < ht[right]){
                left++;
            }else
                right--;
        }
        return maxArea;

    }
    public static void main(String[] args){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area ===> " +maxArea(height));
    }
}
