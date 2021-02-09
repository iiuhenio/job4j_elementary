package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMax2Test {
    @Test
    public void whenSecondMax() {
        int result = MultiMax2.max(1, 4, 2);
        assertThat(result, is(4));
    }
}