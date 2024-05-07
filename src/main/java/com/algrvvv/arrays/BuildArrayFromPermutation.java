package com.algrvvv.arrays;

/**
 * @see <a href="https://leetcode.com/problems/build-array-from-permutation/description/">1920. Build Array from Permutation</a>
 */
public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
