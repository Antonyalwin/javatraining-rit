#include <stdio.h>

int countEvensOdds(int input1, int input2, int input3, int input4, int input5, char input6[]) {
    int count = 0;
    int inputs[5] = {input1, input2, input3, input4, input5};

    // Determine the length of the input6 string
    int length = 0;
    while (input6[length] != '\0') {
        length++;
    }

    // Check if input6 matches "even" or "odd"
    int isEven = 1;
    if (length != 4) {
        isEven = 0;
    } else {
        if (input6[0] != 'e' || input6[1] != 'v' || input6[2] != 'e' || input6[3] != 'n') {
            isEven = 0;
        }
    }

    // Count even or odd numbers based on the match
    if (isEven) {
        for (int i = 0; i < 5; i++) {
            if (inputs[i] % 2 == 0) {
                count++;
            }
        }
    } else {
        int isOdd = 1;
        if (length != 3) {
            isOdd = 0;
        } else {
            if (input6[0] != 'o' || input6[1] != 'd' || input6[2] != 'd') {
                isOdd = 0;
            }
        }

        if (isOdd) {
            for (int i = 0; i < 5; i++) {
                if (inputs[i] % 2 != 0) {
                    count++;
                }
            }
        } else {
            printf("Invalid input. Please provide 'even' or 'odd' as the sixth parameter.\n");
        }
    }

    return count;
}

int main() {
    int input1, input2, input3, input4, input5;
    char input6[5];

    // Get the inputs
    printf("Enter 5 numbers: ");
    scanf("%d %d %d %d %d", &input1, &input2, &input3, &input4, &input5);
    
    printf("Enter 'even' or 'odd': ");
    scanf("%4s", input6);

    int result = countEvensOdds(input1, input2, input3, input4, input5, input6);

    printf("Count: %d\n", result);

    return 0;
}
