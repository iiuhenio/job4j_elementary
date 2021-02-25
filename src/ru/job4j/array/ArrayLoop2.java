package ru.job4j.array;

public class ArrayLoop2 {
    public static void main(String[] args) {
        int[] names = new int[5];
        for (int index = 0; index < names.length; index++) {
            names[index] = index * 2 + 3;
        }
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
