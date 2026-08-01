#include <stdio.h>

int sumup(int above) {
    int below, sum, result;

    printf("In: %d\n", above);

    if (above <= 1)
    {
        return 1;
    }

    below = above - 1;

    printf("Down: %d\n", below);

    sum = sumup(below);
    
    printf("Back: %d\n", sum);

    result = above + sum;

    printf("Resukt: %d\n", result);

    return result;
}

int main(void) {
    printf("Sumup result: %d\n", sumup(5));
}