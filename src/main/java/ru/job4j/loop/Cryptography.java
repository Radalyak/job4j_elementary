package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s == "") {
            return "empty";
        } else {
            int len = s.length();
            StringBuilder str = new StringBuilder(s);
            System.out.println(str);
            for (int i = len - 1; i >= 0; i--) {
                char temp = s.charAt(i);
                if (i < len - 4) {
                    str.setCharAt(i, '#');
                } else {
                    str.setCharAt(i, temp);
                }
            }
            String out = new String(str);
            return out;
        }
    }
}