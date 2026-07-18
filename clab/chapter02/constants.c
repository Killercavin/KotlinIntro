#include <stdio.h>

int main() {
    const char c = 'a';

    // c = 's'; /** this won't work - c is declared a constant */

    printf("%c\n", c);

    return 0;
}