package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false; // я бы сюда добавил break чтобы не проверять
                                // массив дальше если он уже не однородный
            }
        }
        return result;
    }
}
