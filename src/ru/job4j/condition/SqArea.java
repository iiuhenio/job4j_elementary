package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl1 = k + 1;
        double rsl2 = 2 * rsl1;
        double rsl3 = p / rsl2;
        double rsl4 = k * rsl3;
        double rsl5 = rsl3 * rsl4;
        return rsl5;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}