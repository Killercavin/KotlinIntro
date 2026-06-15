package javalab.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] twoD = new int[3][2];

        int[][] arr2D = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < twoD.length; row++) {
            for (int col = 0; col < twoD[row].length; col++) {
                twoD[row][col] = input.nextInt();
            }
        }

        System.out.println("The two dimension array is: " +  Arrays.deepToString(twoD));

        for (int[] row : arr2D) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("The two dimension array is: " +  Arrays.deepToString(arr2D));
    }
}
