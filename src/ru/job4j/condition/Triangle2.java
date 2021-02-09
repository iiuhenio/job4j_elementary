package ru.job4j.condition;

public class Triangle2 {

    public static boolean exist(double ab, double ac, double bc) {
        boolean yes = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return true;
    }
}