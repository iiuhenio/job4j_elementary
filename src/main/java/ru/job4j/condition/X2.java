package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = X2.calc(a, b, c, x);
        int rsl1 = X2.calc(1, 1, 1, 1);
        int rsl2 = X2.calc(0, 1, 1, 1);
        int rsl3 = X2.calc(1, 1, 0, 1);
        int rsl4 = X2.calc(1, 1, 1, 0);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}