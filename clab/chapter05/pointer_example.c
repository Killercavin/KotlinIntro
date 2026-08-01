#include <stdio.h>

int main () {
    int x = 1;

    int *ip = &x;
    int *ip;

    printf("%p\n", ip);
    ip = &x;

    printf("%d\n", &x);
}