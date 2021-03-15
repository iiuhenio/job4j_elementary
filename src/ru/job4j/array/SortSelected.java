package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, 0, data.length); /* ищет мин.число в диап-не */
            int index1 = FindLoop.indexOf(data, min, 0, data.length); /* ищет индекс мин.числа */
            int temp = data[index]; /* временная ячейка для хранения индекса 0 (например)  */
            data[index] = data[index1]; /* мин.число перемещаем в начало */
            data[index1] = temp; /* возращаем число из 0 на место минимального */


        }
        return data;
    }
}