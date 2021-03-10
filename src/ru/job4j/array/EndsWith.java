package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index <= word.length - 1; index++) {
            if (post[0] != word[3] && post[1] != word[4]) {
                return false;

            }

            /* проверить. что массив word имеет последние элементы одинаковые с post */

        }
        return true;
    }
}