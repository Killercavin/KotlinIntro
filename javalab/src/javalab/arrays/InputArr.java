package javalab.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Arrays.toString(arr));
    }
}
