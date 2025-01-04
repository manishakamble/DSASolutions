package com.example.dsasolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public static String reverseWord(String words){

        words = words.trim();

        List<String> wordList = Arrays.asList(words.split("\\s+"));

        Collections.reverse(wordList);

        return String.join(" ", wordList);

    }

    public static void main(String[] args){

        String example = "  this    is DSA Practice        code";

        System.out.println("final ---->   " + reverseWord(example));

    }
}
