package javalab.arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        reverse(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }*/

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            System.out.println("Swapping index " + start + " (" + arr[start]
                    + ") with index " + end + " (" + arr[end] + ")");
            swap(arr, start, end);
            System.out.println("Array now: " + Arrays.toString(arr));
            start++;
            end--;
            System.out.println("Start=" + start + ", End=" + end);
            System.out.println("---");
        }
    }
}
