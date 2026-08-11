#include <stdio.h>

int stringlen(char *s) {
    int n;

    for (n = 0; *s != '\0'; s++)
        n++;

    return n;
}


int main(void)
{
    int result = stringlen("hello");
    printf("The length is %d\n", result);
}