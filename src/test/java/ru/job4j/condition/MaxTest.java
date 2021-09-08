package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To2Then15() {
        int left = 15;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To20Then20() {
        int left = 15;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);

    }
}