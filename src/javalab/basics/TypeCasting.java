package javalab.basics;

public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(67.89); // type casting
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte  b = (byte)a; // 257 % 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        int e = c * d / 100;
        System.out.println(e);

        int numChar = 'a';
        System.out.println(numChar); // 97

        // type promotion rules
        /*
         * - all the downstream type values cast to upstream type if an operation involves a downstream type with an upstream type for numbers
         */
    }
}
