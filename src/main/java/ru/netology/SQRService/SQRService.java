package ru.netology.SQRService;

public class SQRService {
    int count;
    int i;

    int CountSqrInRange(int lowerLimitRange, int upperLimitRange) {
        for (i = 1; i <= 99; i++) {
            if (i * i >= lowerLimitRange && i * i <= upperLimitRange) count++;
        }
        return count;
    }
}
