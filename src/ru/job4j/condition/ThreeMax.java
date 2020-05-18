package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
            return second;
        }
        if (second >= first && second >= third) {
            return third;
        }
        return result;
    }
}