package com.service.leetcode.questions;

import java.util.Stack;

public class ValidParentheses {

    public static boolean execute(String input) {
        Stack<Character> stack = new Stack<>();

        for( Character c : input.toCharArray() ){
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean execute2(String input) {
        Stack<Character> stack = new Stack<>();

        for( Character c : input.toCharArray() ){
            switch (c){
                case '(': stack.push(')'); break;
                case '{': stack.push('}'); break;
                case '[': stack.push(']'); break;
                default: {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
