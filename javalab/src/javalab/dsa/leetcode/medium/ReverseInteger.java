package javalab.dsa.leetcode.medium;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int rev = 0;

        if (x < 0) {
            rev = -rev;
        }

        while (x != 0) {
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7) || rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            } else {
                rev = rev * 10 + pop;
            }
            x /= 10;
        }

        return rev;
    }
}
