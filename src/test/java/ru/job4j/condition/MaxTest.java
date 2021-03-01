package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax6To1Then6() {
        int result = Max.max(6, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax7To11Then11() {
        int result = Max.max(7, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenMax15to15Then15() {
        int result = Max.max(15, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenMax10to20to30Then30() {
        int result = Max.max(10, 20, 30);
        assertThat(result, is(30));
    }

    @Test
    public void whenMax5to6to7to8Then8() {
        int result = Max.max(5, 6, 7, 8);
        assertThat(result, is(8));
    }
}