#include <stdio.h>
#include <string.h>

int main(void) {
    char name[] = "Ritchie";
    printf("%s\n", name);

    printf("%zu\n", strlen(name));

    char *s = "hello";
    printf("%s\n", s);
    printf("%c\n", &s);
}