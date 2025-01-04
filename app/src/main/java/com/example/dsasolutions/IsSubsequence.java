package com.example.dsasolutions;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){

        int sLen = s.length() ; int dLen = t.length();

        int m = 0 ; int n = 0;

        while (m < sLen && n < dLen){

            if(s.charAt(m) == t.charAt(n)){
                m++;
            }
            n++;
        }
        return  m == sLen;
    }
    public static void main(String[] args){

        String source = "abc";
        String destination = "ahbgdc";
        System.out.println("isSubsequence ---->  "+isSubsequence(source,destination));
    }
}
