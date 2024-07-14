package com.example.dsasolutions;

public class ValidAnagram {

    public static boolean isValidGram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("status  " + isValidGram("anagramm", "mmargana"));
    }
}
