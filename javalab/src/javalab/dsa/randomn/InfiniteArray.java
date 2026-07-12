package javalab.dsa.randomn;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 23, 30};
        int target = 15;

        // int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (end < arr.length - 1 && target > arr[end]) {
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
            end = Math.min(end, arr.length - 1);

            start = newStart;
        }

        return findInfinite(arr, target, start, end);
    }

    public static int findInfinite(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else  {
                return mid;
            }
        }

        return -1;
    }
}
