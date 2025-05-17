package com.service.leetcode;

import com.service.leetcode.questions.LongestCommonPrefix;
import com.service.leetcode.questions.RemoveDuplicateElement;
import com.service.leetcode.questions.RemoveDuplicatesSortedArray;
import com.service.leetcode.questions.ValidParentheses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetCodeApplication.class, args);

		System.out.println("============ Question 01 ================");

		String[] input1 = {"flower", "flux", "flow", "flight"};
		System.out.println("Result for longest common prefix : " + LongestCommonPrefix.execute(input1));

		System.out.println("=========================================");

		System.out.println("============ Question 02 ================");

		String input2 = "[()]";
		System.out.println("Result for valid parentheses : " + ValidParentheses.execute(input2));
		System.out.println("Result for valid parentheses : " + ValidParentheses.execute2(input2));

		System.out.println("=========================================");

		System.out.println("============ Question 03 ================");

		int[] nums = {1,1,2,2,3,4,5,6,7,7};
		System.out.println("Result for removal of duplicates : " + RemoveDuplicatesSortedArray.execute(nums));

		System.out.println("=========================================");

		System.out.println("============ Question 04 ================");

		int[] nums1 = {3,2,2, 3};
		System.out.println("Result for removal of duplicates : " + RemoveDuplicateElement.execute(nums1, 3));

		System.out.println("=========================================");
	}

}
