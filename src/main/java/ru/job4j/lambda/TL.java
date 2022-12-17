package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class TL {
    public static void main(String[] args) {

        String[] names = {
                "Ivan",
                "Volodya"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
    }
}
