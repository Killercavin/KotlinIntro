package javalab.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the fruit name: ");
        String fruit = sc.nextLine();

        String[] fruits = {"orange", "mango", "banana", "apple"};

        System.out.println("Fruits before the change: " + Arrays.toString(fruits));

        // after change
        change(fruits,  fruit);

        System.out.println("Fruits after the change: " + Arrays.toString(fruits));

        sc.close();
    }

    static void change(String[] arr, String value) {
        arr[0] = value;
    }
}
