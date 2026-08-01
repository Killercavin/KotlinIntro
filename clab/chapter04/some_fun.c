#include <stdio.h>

int my_mult(int a, int b) {
    return a * b;
}

int main() {
    /* int my_mult(int a, int b); */
    int result = my_mult(6, 7);
    printf("Answer: %d\n", result);
}