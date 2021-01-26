package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = 2 * (k + 1);
        double h1 = p / h;
        double l = h1 * k;
        double s = l * h1;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
