package com.example.dsasolutions;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String input) {

        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {

            while (i < j && !Character.isLetterOrDigit(input.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(input.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

     //   String inputString = "A man, a plan, a canal: Panama";
         String inputString = "car racer" ;
        System.out.println("Valid Palindrome : " + isValidPalindrome(inputString));
    }
}
