package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double first1 = Math.pow(rsl1, 2);
        double first2 = Math.pow(rsl2, 2);
        double rsl3 = first1 + first2;
        double first3 = Math.sqrt(rsl3);
        return first3;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 2, 5, 3);
        System.out.println("result (4, 2) to (5, 3) " + result);
    }
}
