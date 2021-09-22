package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To3To2Then7() {

        int result = Max.max(7, 3, 2);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax81To1To37To8Then81() {
        int result = Max.max(81, 1, 37, 8);
        int expected = 81;
        Assert.assertEquals(result, expected);

    }
}