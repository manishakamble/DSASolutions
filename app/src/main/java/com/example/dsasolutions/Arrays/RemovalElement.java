package com.example.dsasolutions.Arrays;

public class RemovalElement {

   public static int removalElement(int[] nums ,int val){

       int i =0;
       for(int j = 0 ; j < nums.length ; j++){
           if(nums[j] != val){
               nums[i] = nums[j];
               i++;
           }
       }
       return i;
   }

    public static void main(String[] args){

       int[] number = new int[]{3,2,2,1,0};
       int val = 2;
       int k = RemovalElement.removalElement(number,val);

       System.out.println("Kth Element  " + k);
    }
}
