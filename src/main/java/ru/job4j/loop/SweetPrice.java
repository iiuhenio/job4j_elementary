package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        int sum = 0;
        for (int index = 1; index <= 5; index++) {
            sum = price * index;
            System.out.println(sum);

        }
    }
}