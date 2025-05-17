package com.service.leetcode.questions;

public class RemoveDuplicateElement {
    public static int execute(int[] nums, int val) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                if (nums[j] != val) {
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1 + val;
    }
}
