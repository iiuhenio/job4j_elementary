package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int result;

        for (int i = 0; i < left.length(); i++) {
            for (int j = 0; j < right.length(); j++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result == 0) {
                    break;
                } else {
                    return result;
                }
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}