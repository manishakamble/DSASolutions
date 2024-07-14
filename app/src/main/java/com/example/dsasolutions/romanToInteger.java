package com.example.dsasolutions;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public static int romanToInt(String input) {
        int sum = 0;
        int i = 0;
        while (i < input.length()) {
            String currentSymbol = input.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < input.length()) {
                String nextSymbol = input.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            if (currentValue < nextValue) {
                sum = sum + (nextValue - currentValue);
                i += 2;
            } else {
                sum = sum + currentValue;
                i += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Convert to Integer : " + romanToInt("MCMXCIV"));
    }
}
