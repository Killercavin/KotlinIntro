package javalab.dsa.leetcode.easy;

// Question: 9

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            int lastDigit = x % 10;

            reversedHalf = reversedHalf * 10 + lastDigit;

            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
