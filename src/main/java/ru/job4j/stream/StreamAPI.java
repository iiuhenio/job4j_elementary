package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>(Arrays.asList(1, -2, 3, -4, -5));
        List<Integer> y = x.stream().filter(z -> z > 0).collect(Collectors.toList());
        y.forEach(System.out::println);
    }
}
