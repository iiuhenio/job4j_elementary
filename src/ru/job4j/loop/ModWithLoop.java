package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
    n = n - d;
    }
    return n;
    }
}