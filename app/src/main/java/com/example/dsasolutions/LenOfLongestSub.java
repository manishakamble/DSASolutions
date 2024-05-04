package com.example.dsasolutions;

import java.util.HashMap;
import java.util.Map;

public class LenOfLongestSub {

    public static int lengthOfLongestSubString(String s) {
        int ans = 0;
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int j = 0, i = 0 ; j < n ; j++){
            if(map.containsKey(s.charAt(j))){
                System.out.println("i value before "+ i);

                i = Math.max(map.get(s.charAt(j)),i);

                System.out.println("value at j "+ map.get(s.charAt(j)));
                System.out.println("i value after "+ i);
            }
            ans = Math.max(ans , j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }

    public static void main(String args[]) {

        String inputString = "pwwkew";

        System.out.println("Length of longest Sub-String -----> " + lengthOfLongestSubString(inputString));
    }
}
