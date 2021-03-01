package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1To4() {
        int[] input = {1, 3, 5, 7, 9, 11};
        int[] expect = {1, 9, 5, 7, 3, 11};
        int[] rsl = SwitchArray.swap(input, 1, 4);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {2, 4, 6, 8, 10};
        int[] expect = {2, 6, 4, 8, 10};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }
}