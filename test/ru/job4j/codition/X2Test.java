package ru.job4j.codition;

import org.junit.Test;
import org.junit.Assert;


public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /*Входные параметра. здесь из бутет 4*/
    int a = 10;
    int b = 0;
    int c = 0;
    int x = 2;
    /*ожидаемое значение это всегдав переменная*/
    int expected = 40;
    /* вызов методаб который хотим проверить*/
    /*результат вычисления. это всегда одна переменная*/
    int rsl = X2.calc(a, b, c, x);
    /*Сравнение полученного значения с ожидаемым*/
    Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C1X1Then3() {
        /*Входные параметра. здесь из бутет 4*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /*ожидаемое значение это всегдав переменная*/
        int expected = 3;
        /* вызов методаб который хотим проверить*/
        /*результат вычисления. это всегда одна переменная*/
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым*/
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA0B1C1X1Then2() {
        /*Входные параметра. здесь из бутет 4*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /*ожидаемое значение это всегдав переменная*/
        int expected = 2;
        /* вызов методаб который хотим проверить*/
        /*результат вычисления. это всегда одна переменная*/
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым*/
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C0X1Then2() {
        /*Входные параметра. здесь из бутет 4*/
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /*ожидаемое значение это всегдав переменная*/
        int expected = 2;
        /* вызов методаб который хотим проверить*/
        /*результат вычисления. это всегда одна переменная*/
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым*/
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C1X0Then1() {
        /*Входные параметра. здесь из бутет 4*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /*ожидаемое значение это всегдав переменная*/
        int expected = 1;
        /* вызов методаб который хотим проверить*/
        /*результат вычисления. это всегда одна переменная*/
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым*/
        Assert.assertEquals(expected, rsl);
    }
}