package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean eq = false;
        if (left[left.length - 1] == right[right.length - 1]) {
            eq = true;
        }
        return eq;
    }
}
