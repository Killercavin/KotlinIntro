#include <stdio.h>

int main(void)
{
    int x = 1;

    int *ip = &x;

    *ip += 10; //  increasing the pointer increaes the value of the variable being pointed to
    printf("The value of x is %d\n", *ip);
}
