package ru.job4j.condition;

public class TrgArea2 {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = p * (p - a) * (p - b) * (p - c);
        double root = Math.sqrt(rsl);
        return root;
    }

    public static void main(String[] args) {
        double root = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + root);
    }
}