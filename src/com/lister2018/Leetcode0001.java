package com.lister2018;

public class Leetcode0001 {
	
	/**
	 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
	 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i != j && (nums[i] + nums[j]) == target) {
					System.out.println("aaa");
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
