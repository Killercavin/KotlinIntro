#include <stdio.h>

int main()
{
    printf("%s", get_name());
}

// the string is scoped on the function block
const char *get_name(void) {
    char name[] = "Hello";
    return name;
}

// the string is existing globally
char getting_name(){
    return "World";
}