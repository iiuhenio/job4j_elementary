package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {2, 1, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 4, 3, 5, 6};
        int[] rsl = SwitchArray.swap(input, 2, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 9, 12};
        int[] expect = {1, 2, 3, 5, 4, 6, 7, 9, 12};
        int[] rsl = SwitchArray.swap(input, 3, 4);
        assertThat(rsl, is(expect));
    }
}