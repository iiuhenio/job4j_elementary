package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int sum = 1;
        for (int index = a; index <= b; index++) {
            sum = sum * index;
        }
        return sum;
    }
}





