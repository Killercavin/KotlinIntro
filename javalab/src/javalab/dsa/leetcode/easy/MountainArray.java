package javalab.dsa.leetcode.easy;

// Question: 832

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid =  start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
