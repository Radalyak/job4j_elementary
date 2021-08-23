package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            int number = i;
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
