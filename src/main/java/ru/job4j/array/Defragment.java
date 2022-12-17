package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) { /* если ячейка пустая. */
                for (int i = index + 1; i < array.length; i++) { /* переместить первую не null ячейку. Нужен цикл. */
                    if (array[i] != null) { /* если аррэй и не пустая */
                        String temp = array[index]; /* записываем аррэй индекс в во временную темп */
                        array[index] = array[i]; /* аррэй темп = аррэй и */
                        array[i] = temp; /* записываем аррэй и в темп. */
                        break;
                    }
                }
            }

            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}