package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.util.function.Function;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraFunctionThenQuadraResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAnotherFunctionThenAnotherResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}