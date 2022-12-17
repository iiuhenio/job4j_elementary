package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1); /* ищет мин.число в диап-не */
            int index1 = FindLoop.indexOf(data, min, index, data.length); /* ищет индекс мин.числа */
            int temp = data[index]; /* временная ячейка для хранения индекса мин числа  */
            data[index] = data[index1]; /* мин.число перемещаем в мин индекс */
            data[index1] = temp; /* возращаем число из 0 на место минимального */

        }
        return data;
    }
}