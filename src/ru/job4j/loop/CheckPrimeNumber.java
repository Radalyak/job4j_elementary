package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean primeNumber = false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i != 0) {
                primeNumber = true;
                break;
            } else {
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
}
