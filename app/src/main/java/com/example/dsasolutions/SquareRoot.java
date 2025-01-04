package com.example.dsasolutions;

public class SquareRoot {

    public static int squareRootOfNumber(int input){
        if(input < 2) return input;
        long num;
        int pivot,left = 2; int right = input/2;

        while (left <= right){
            pivot = left + (right - left)/2 ;
            System.out.println("pivot  " + pivot);
            num = pivot * pivot;
            if(num > input){
                right = pivot  - 1 ;
                System.out.println("right " +right);
            }else if(num < input){
                left = pivot +  1;
                System.out.println("left " +left);
            }else return pivot;
        }
        return right;
    }
    public static void main(String[] args){
        System.out.println("Square root of  " +squareRootOfNumber(10));
    }
}
