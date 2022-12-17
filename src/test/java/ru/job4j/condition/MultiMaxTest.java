package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 6, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 2, 2);
        assertThat(result, is(2));
    }
}