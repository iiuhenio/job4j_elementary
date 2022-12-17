package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        int count = 0;
        for (int index = 1; index <= n; index++) {
            if (n % index == 0) {
                System.out.println(index);

            }

        }

    }
}