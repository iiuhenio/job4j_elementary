package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        Point p = new Point(1, 4, 9);
        Point p1 = new Point(1, 2, 3);
        double rsl = p.distance3d(p1);
        assertThat(rsl, is(6.324555320336759));
    }

    @Test
    public void distance3d2() {
        Point p = new Point(2, 2, 2);
        Point p1 = new Point(1, 1, 1);
        double rsl = p.distance3d(p1);
        assertThat(rsl, is(1.7320508075688772));
    }

}