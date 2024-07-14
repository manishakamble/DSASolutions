package com.example.dsasolutions;

public class ValidWordAbbreviation {
    public static boolean isValidWordAbbreviation(String word, String abbr) {
        int i =0 ;
        int j = 0;
        while (i < word.length() && j < abbr.length()){
            if(Character.isDigit(abbr.charAt(j))){
               if(abbr.charAt(j) == '0'){
                   return false;
               }
                int num = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + Character.getNumericValue(abbr.charAt(j));
                    System.out.println("numeric  " + Character.getNumericValue(abbr.charAt(j)));
                    System.out.println("num  " + num);
                    j++;
                }
                i += num;
            }else if(word.charAt(i) != abbr.charAt(j)){
                return false;
            }else {
              i++;
              j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        System.out.println(isValidWordAbbreviation("internationalization", "i12iz4n"));  // true
       // System.out.println(isValidWordAbbreviation("apple", "a2e"));  // false
      //  System.out.println(isValidWordAbbreviation("apple", "5"));  // false
    }
}
