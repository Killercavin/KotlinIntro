package javalab.dsa.searching.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = linearSearch(myArray, 11);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) return index;
        }
        return -1;
    }
}
