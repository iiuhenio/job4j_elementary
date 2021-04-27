package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int index = 0; index + 1 < array.length; index++) {
            if (array[index] <= array[index + 1]) {
                rsl = true;
            } else {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}



