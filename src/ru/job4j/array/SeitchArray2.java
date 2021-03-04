package ru.job4j.array;

public class SeitchArray2 {
    public static int[] swapBorder(int[] array) {
        int temp = array[0]; /* 0 перемещаем в ячейку Темп */
        array[0] = array[array.length - 1]; /* в 0 помещаем аррэй ленгз */
        array[array.length - 1] = temp; /* в аррэй ленгз помещаем 0 */
        return array; /* результат вычисления - аррэй */
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}