package javalab.dsa.searching.binary;

import java.util.Arrays;

public class BinarySearchFloorCeil {
    /**
     * Returns the largest element <= target
     * Returns -1 if no such element exists
     */
    public static int floorSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floorIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) {
                floorIdx = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floorIdx;
    }

    /**
     * Returns the smallest element >= target
     * Returns -1 if no such element exists
     */
    public static int ceilSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ceilIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target) {
                ceilIdx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceilIdx;
    }
    
    public static void printResult(int[] arr, int target) {
        int floor = floorSearch(arr, target);
        int ceil = ceilSearch(arr, target);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Floor: " + (floor == -1 ? "Not found" : arr[floor]));
        System.out.println("Ceil: " + (ceil == -1 ? "Not found" : arr[ceil]));
        System.out.println("---");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        printResult(arr, 8);   // Floor: 7, Ceil: 9
        printResult(arr, 0);   // Floor: Not found, Ceil: 1
        printResult(arr, 15);  // Floor: 13, Ceil: Not found
        printResult(arr, 7);   // Floor: 7, Ceil: 7 (exact match)
    }
}
