package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8Then2() {
        int[] data = {9, 5, 8, 1};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2ThenMinus1() {
        int[] data = {9, 5, 8, 1, 12};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind10() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 10;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind8() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 8;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}