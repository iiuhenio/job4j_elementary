package ru.job4j.condition;

public class Point2 {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow((x1 - x2), 2);
        double rs2 = Math.pow((y1 - y2), 2);
        double rsl3 = rsl + rs2;
        double rsl1 = Math.sqrt(rsl3);
        return rsl1;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 5, 2, 3);
        System.out.println("result (3, 5) to (2, 3) " + result);
    }
}