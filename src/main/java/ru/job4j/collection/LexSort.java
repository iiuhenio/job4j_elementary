package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] wordL = left.split(". ");
        String[] wordR = right.split(". ");

        int intLeft = Integer.parseInt(wordL[0]);
        int intRight = Integer.parseInt(wordR[0]);

        return Integer.compare(intLeft, intRight);
    }
}