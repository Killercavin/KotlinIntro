package javalab.dsa.leetcode.easy;

// Question: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description

public class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Standard binary search for first element > target
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == letters[mid]) {
                return letters[mid + 1];
            }

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start == letters.length) {
            return letters[0];
        }

        return letters[start];
    }

    public static void main(String[] args) {
        /*
         * char[] letters = {'c', 'f', 'j'};
         * char target = 'c';
         */

        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';

        System.out.println(nextGreatestLetter(letters, target));
    }
}
