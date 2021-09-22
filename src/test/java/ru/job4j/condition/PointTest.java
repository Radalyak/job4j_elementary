package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to00Then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to17Then2() {
        double expected = 2;
        Point a = new Point(1, 5);
        Point b = new Point(1, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when70to75Then5() {
        double expected = 5;
        Point a = new Point(7, 0);
        Point b = new Point(7, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}