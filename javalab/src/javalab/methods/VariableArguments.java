package javalab.methods;

import java.util.Arrays;

public class VariableArguments {
    static void varArgs(int ...a) {
        System.out.println("varArgs: " + Arrays.toString(a));
    }

    static  void multiTypesVarArgs(int b, char c, String ...s) {
        // output
    }
}
