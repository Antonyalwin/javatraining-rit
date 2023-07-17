#include <stdio.h>

int totalHillWeight(int input1, int input2, int input3) {
    int totalWeight = 0;
    int currentWeight = input2;

    for (int i = 1; i <= input1; i++) {
        totalWeight += currentWeight * i;
        currentWeight += input3;
    }

    return totalWeight;
}

int main() {
    int levels, headWeight, weightIncrement;
    printf("Enter the total levels: ");
    scanf("%d", &levels);
    printf("Enter the weight of the head level: ");
    scanf("%d", &headWeight);
    printf("Enter the weight increments of each subsequent level: ");
    scanf("%d", &weightIncrement);

    int totalWeight = totalHillWeight(levels, headWeight, weightIncrement);
    printf("Total weight of the hill pattern: %d\n", totalWeight);

    return 0;
}
