package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
int count = 0;
        for (int index = a; index <= b; index = index + 2) {
             count = count + index;
            }

        return count;
    }
}

