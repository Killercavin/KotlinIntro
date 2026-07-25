#include <stdio.h>

int main () {
    int x = 1;

    int *ip;

    ip = &x;

    printf("%d\n", &x);
}