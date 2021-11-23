package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public double divide(int b) {
        return b / x;
    }

    public double sumAllOperation(int z) {
        return sum(z) + multiply(z) + minus(z) + divide(z);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(5));
        System.out.println(minus(5));
        System.out.println(calc.divide(5));
        System.out.println(calc.sumAllOperation(5));
    }
}