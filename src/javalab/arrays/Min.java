package javalab.arrays;

public class Min {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int result = minRange(myArray, 2, 4);
        System.out.println(result);
    }

    static int minRange(int[] arr, int start , int end) {
        if  (arr == null) { return -1; }

        if (start > end) { return -1; }

        int minVal = arr[start];

        for (int i = start + 1; i < end; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        return minVal;
    }
}
