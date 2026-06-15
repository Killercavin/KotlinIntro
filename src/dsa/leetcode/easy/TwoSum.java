package dsa.leetcode.easy;

import java.util.Arrays;

// Question: https://leetcode.com/problems/two-sum

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
                if (nums[outerIndex] == target - nums[innerIndex]) {
                    return new int[]{outerIndex, innerIndex};
                }
            }
        }
        return null;
    }
}
