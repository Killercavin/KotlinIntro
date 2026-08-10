#include <stdio.h>

int main(void)
{
    printf("EOF = %d\n", EOF);

    printf("sizeof(char) = %zu\n", sizeof(char));

    char c = -1;

    printf("c = %d\n", c);

    if (c == EOF)
        puts("Ding");
    else
        puts("Dong");
}