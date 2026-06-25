package javalab.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 20;  i++) {
            list.add(i);
        }

        System.out.println("The list is: " + list);
        System.out.println(list.set(0, 99));

        // Create first row
        ArrayList<Integer> firstRow = new ArrayList<>(List.of(1, 2, 3));

        // Create 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Add rows
        matrix.add(firstRow);
        matrix.add(new ArrayList<>(List.of(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // Insert at index 1
        matrix.add(1, new ArrayList<>(List.of(99, 100, 101)));

        // Print the matrix
        System.out.println(matrix);
        // Output: [[1, 2, 3], [99, 100, 101], [4, 5, 6], [7, 8, 9]]

        // Access elements
        System.out.println(matrix.getFirst().get(1));  // 2 (row 0, column 1)
    }
}
