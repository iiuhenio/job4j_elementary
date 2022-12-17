package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public static int max(int left, int right, int third, int forth) {
        return max(left, max(right, third, forth));
    }
}