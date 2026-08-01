#include <stdio.h>

int main () {
    int x = 1;

    int *ip = &x;

    printf("%p\n", ip);
}