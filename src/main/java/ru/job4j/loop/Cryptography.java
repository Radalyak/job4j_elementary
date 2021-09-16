package ru.job4j.loop;

public class Cryptography {

    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        }
            StringBuilder str = new StringBuilder(s);
            for (int i = 0; i < str.length() - 4; i++) {
                    str.setCharAt(i, '#');
                }
        return str.toString();
            }
        }