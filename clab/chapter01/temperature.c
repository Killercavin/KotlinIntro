#include <stdio.h>

int main() {
    float fahrenheit, celsius, lower, step, upper;

    lower = 0;
    step = 20;
    upper = 300;

    fahrenheit = lower;

    printf("Fahrenheit Celsius\n");

    while (fahrenheit <= upper) {
        celsius = (5.0 / 9.0) * (fahrenheit - 32);
        printf("%3.0f \t %6.1f\n", fahrenheit, celsius);
        fahrenheit = fahrenheit + step;
    }
    

    printf("Done\n");

    return 0;
}