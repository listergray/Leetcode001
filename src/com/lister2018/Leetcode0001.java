package com.lister2018;

public class Leetcode0001 {
	
	/**
	 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
	 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
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
