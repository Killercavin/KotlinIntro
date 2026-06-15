package dsa.leetcode.easy;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {1, 22, 3, 4, 3455};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String stringOfElement = String.valueOf(num);

            if (stringOfElement.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
