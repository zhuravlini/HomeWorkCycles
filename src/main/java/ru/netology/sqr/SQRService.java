package ru.netology.sqr;

public class SQRService {

    int min;
    int max;

    public int calcSqrt(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= min & i * i <= max) {
                count++;
            }
        }
        return count;
    }
}
