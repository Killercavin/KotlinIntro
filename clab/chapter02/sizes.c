#include <stdio.h>
#include <limits.h>
#include <float.h>

int main() {
    printf("INT_MIN = %d\n", INT_MIN);
    printf("INT_MAX = %d\n", INT_MAX);

    printf("CHAR_MIN = %d\n", CHAR_MIN);
    printf("CHAR_MAX = %d\n", CHAR_MAX);

    printf("UINT_MAX = %u\n", UINT_MAX);

    printf("SHORT_MIN = %d\n", SHRT_MIN);
    printf("SHORT_MAX = %d\n", SHRT_MAX);

    printf("FLOAT_MIN = %f\n", FLT_MIN);
    printf("FLOAT_MAX = %f\n", FLT_MAX);

    return 0;
}