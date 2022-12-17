package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p1 = a + b + c;
        double p = p1 / 2;
        double a1 = p - a;
        double a2 = p - b;
        double a3 = p - c;
        double rsl1 = p * a1 * a2 * a3;
        double rsl2 = Math.sqrt(rsl1);
        return rsl2;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}