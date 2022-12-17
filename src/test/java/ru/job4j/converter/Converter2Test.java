package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class Converter2Test {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void rubleToDollar() {
    }

}