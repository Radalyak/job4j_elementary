package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int i) {
        String s = Integer.toString(i);
        int len = s.length() - 1;
        for (int j = 0; j < (len / 2); j++) {
            if (s.charAt(j) != s.charAt(len - j)) {
                return false;
            }
        }
        return true;
    }
}