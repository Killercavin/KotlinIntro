package javalab.dsa.searching.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};

        int target = 22;

        int ans = orderAgnosticBS(arr, target);
        int ans2 = orderAgnosticBS(arr2, target);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int orderAgnosticBS(int[] array, int target) {
        // find the sorting type: ascending or descending

        int start = 0;
        int end = array.length - 1;

        boolean isAscending = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
