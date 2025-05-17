package com.service.leetcode.questions;

public class RemoveDuplicatesSortedArray {
    public static int execute(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
