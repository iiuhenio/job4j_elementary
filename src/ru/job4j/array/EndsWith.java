package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index <= word.length - 1; index++) {
            if (word[word.length - 1] != post[1] || word[word.length - 2] != post[0]) {
                return false;
            }

            /* проверить. что массив word имеет последние элементы одинаковые с post */

        }
        return result;
    }
}