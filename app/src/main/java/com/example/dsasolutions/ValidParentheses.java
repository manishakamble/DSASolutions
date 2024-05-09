package com.example.dsasolutions;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParentheses(String s) {
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put('}', '{');
        mapping.put(')', '(');
        mapping.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(mapping.containsKey(s.charAt(i))){
                 // closing bracket case
                  char topElement = stack.empty() ? '#' : stack.pop();
                  if(topElement != mapping.get(s.charAt(i))){
                      return  false;
                  }
            }else {
                // if opening bracket then push to stack
                if(s.charAt(i) == '(' || s.charAt(i)== '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                    System.out.println("item added in stack "+ s.charAt(i));
                }

            }
        }
        return stack.isEmpty();
    }


    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        if(s.length()==1){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (st.isEmpty() || st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (c == '}') {
                if (st.isEmpty() || st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (c == ']') {
                if (st.isEmpty() || st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]) {
   //     String inputString = "()[]{}";
        String inputString = "( A+B{C+(D*)+A+[]}))";
     //   System.out.println("Valid Parentheses " + isValid(inputString));
        System.out.println("Valid Parentheses " + isValidParentheses(inputString));
    }
}
