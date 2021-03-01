package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5Elements() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Elements() {
        int[] input = new int[] {21, 8, 13};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {8, 13, 21};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort6Elements() {
        int[] input = new int[]{3, 26, 1, 67, 0, 41};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 1, 3, 26, 41, 67};
        assertThat(result, is(expect));
    }
}