#include <stdio.h>

int main(void) {

    char type = ' ';
    int result = 0;

    printf("What operation do you want to perform? \nm for multiplication \na for addition \ns for subtraction \nd for division\n");

    scanf("%c", type);

    int first = 0;
    int second = 0;
    printf("Enter the twp numbers of the equation (one per line)");
    scanf("%d", &first);
    scanf("%d", &second);

    if (type == 'a') {
        printf("%d", first + second);
    }
    else if (type == 'm') {
        printf("%d", first * second);
    }
    else if (type == 's') {
        printf("%d", first - second);
    }
    else if (type == 'd') {
        printf("%d", first / second);
    }
    else {
        printf("Invalid choice");
    }

    return 0;
}