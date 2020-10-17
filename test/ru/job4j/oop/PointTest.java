package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when123To567Then6Point928() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(5, 6, 7);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(6.928, 0.001));
    }

    @Test
    public void when000To915Then10Point344() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(9, 1, 5);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(10.344, 0.001));
    }
}