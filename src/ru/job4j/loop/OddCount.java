package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int count = 0;
        for (int index = a; index <= b; index++) {
            if (index % 2 == 1) {
                count++;
            }
        }
     return count;
    }
}










