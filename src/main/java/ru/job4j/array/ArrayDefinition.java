package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        int[] ints = new int[10];
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Lekshey";
        names[1] = "Izibay";
        names[2] = "Il'der";
        names[3] = "Anni";
        System.out.println("Размер массива равен: " + ints.length);
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}