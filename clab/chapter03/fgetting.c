#include <stdio.h>

int main(void) {
    char line[2];
    fgets(line, sizeof(line), stdin);
    printf("%zu\n", sizeof(line));
    puts(line);
}