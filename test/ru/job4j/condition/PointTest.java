package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12To35Then3Point605() {
        double expected = 3.605;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24To66Then4Point472() {
        double expected = 4.472;
        int x1 = 2;
        int y1 = 4;
        int x2 = 6;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when37To98Then6Point083() {
        double expected = 6.083;
        int x1 = 3;
        int y1 = 7;
        int x2 = 9;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}