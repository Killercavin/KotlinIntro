#include <stdio.h>

int main () {
    int x = 1;

    int *ip = &x;

    printf("%p\n", ip);

    printf("%d\n", *ip); // value of x
}