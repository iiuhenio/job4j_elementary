package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class Converter2Test {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void main() {
    }
}