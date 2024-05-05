package com.example.dsasolutions;

import java.util.Stack;

public class BackspaceCompare {

    public static String buildString(String inputString) {

        int n = inputString.length();

        Stack<Character> ans = new Stack<>();

        if (n != 0) {
            for (char c : inputString.toCharArray()) {
                if (c != '#') {
                    ans.push(c);
                } else if (!ans.isEmpty()) {
                    ans.pop();
                }
            }
        }
        return String.valueOf(ans);

    }

    public static boolean backspaceCompare(String s, String t) {

        return buildString(s).equals(buildString(t));
    }

    public static void main(String args[]) {
        String s = "c#a#c";
        String t = "c";
        System.out.println("Compare String -----> " + backspaceCompare(s, t));
    }
}
