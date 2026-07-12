package javalab.dsa.leetcode.medium;

// Question: 34

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int[] nums, int target, boolean firstIndexFound) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start =  mid + 1;
            } else if (target < nums[mid]) {
                end =  mid - 1;
            } else {
                ans = mid;
                if  (firstIndexFound) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
