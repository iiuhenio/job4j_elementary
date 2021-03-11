package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if (word.length - 1 != post[1] || word[word.length - 2] != post[0]) {
                return false;
            }



        }
        return result;
    }
}