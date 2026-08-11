#include <stdio.h>

void swap_ponters(int *px, int *py) {
    int temp;

    temp = *px; // copy *px into temp
    *px = *py; // swap *px with *py
    *py = temp; // copy temp into *py
}

int main(void) {
    int x = 10;
    int y = 1;

    swap_ponters(&x, &y);

    printf("The value of x is %d\nThe value of y is %d\n", x, y);
}