package javalab.dsa.leetcode.easy;

// Question: https://leetcode.com/problems/richest-customer-wealth/submissions/2033134336

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][]  accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        int result =  maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        ArrayList<Integer> listOfWealth = new ArrayList<>();

        for (int[] account : accounts) {
            // System.out.println(Arrays.toString(account));
            int wealth = Arrays.stream(account).sum();
            listOfWealth.add(wealth);
        }

        // System.out.println(listOfWealth);

        for (int temp : listOfWealth) {
            if (temp > max) max = temp;
        }

        return max;
    }
}
