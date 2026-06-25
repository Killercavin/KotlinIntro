package javalab.dsa.searching.linear;

public class StringSearch {
    public static void main(String[] args) {
        String str = "hello world";
        boolean result = searchString(str, 'k');

        System.out.println(result);
    }

    static boolean searchString(String str, char target) {
        char[] arr = str.toCharArray();

        for (char value : arr) {
            if (value == target) {
                return true;
            }
        }

        return false;
    }
}
