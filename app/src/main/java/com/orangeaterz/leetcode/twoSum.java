package com.orangeaterz.leetcode;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;
        fun(nums, target);
    }

    private static int[] fun(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    System.out.println(i + "," + (j));
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
