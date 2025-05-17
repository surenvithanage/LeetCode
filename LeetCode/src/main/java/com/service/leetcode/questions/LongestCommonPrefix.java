package com.service.leetcode.questions;

public class LongestCommonPrefix {

    public static String execute(String[] words) {
        String prefix = words[0];

        for( int i = 1; i< words.length; i++) {
            while(words[1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
