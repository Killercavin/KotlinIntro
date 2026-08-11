#include <stdio.h>

int main(void) {
    int a[5] = {20, 188, 93, 204, 361};
    int *pa0 = &a[0];

    printf("%d\n", *(pa0 + 1));
}