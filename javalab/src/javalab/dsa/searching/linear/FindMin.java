package javalab.dsa.searching.linear;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = min(arr);
        System.out.println(result);
    }

    static int min(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
