package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then4() {
        int[] input = {12, 5, 8, 67, 7, 29};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNoNumberThenMinus1() {
        int[] input = {24, 38, 45, 90};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenRangeHasNoNumberThenMinus1() {
        int[] input = new int[] {25, 37, 11, 8, 89, 90, 131, 5};
        int value = 25;
        int start = 1;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}