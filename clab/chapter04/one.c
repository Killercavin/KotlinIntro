#include <stdio.h>

void one(int op) {
    printf("One op before %d\n", op);

    op -= 10;

    printf("One op after %d\n", op);
}

int main() {
    int ma = 42;

    printf("Main ma before %d\n", ma);

    one(20); /*one function call */

    printf("Main ma after %d\n", ma);

    char s[] = "Hello";

    printf("The address of s: %p\n", &s);

    printf("The value of s: %s\n", s);
}