#include <stdio.h>
#include <string.h>

int main() {
    char first[] = "Doe";
    char second[4] = "Doe";

    printf("%zu\n", sizeof(first));
    printf("%zu\n", sizeof(second));
    
    printf("%d\n", second[1]);

    printf("%zu\n", strlen(second));
}