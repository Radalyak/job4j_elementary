package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when000to020Then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100to001ThenLittleMore1() {
        double expected = 1.41;
        Point a = new Point(1, 0, 0);
        Point b = new Point(0, 0, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when150to17Then171() {
        double expected = 2.23;
        Point a = new Point(1, 5, 0);
        Point b = new Point(1, 7, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when302to740Then6() {
        double expected = 6;
        Point a = new Point(3, 0, 2);
        Point b = new Point(7, 4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to2Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}