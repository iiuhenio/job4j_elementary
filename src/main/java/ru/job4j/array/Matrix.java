package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cel = 0; cel < size; cel++) {
                array[row][cel] = (row + 1) * (cel + 1);
            }
        }

        return array;

    }

}
