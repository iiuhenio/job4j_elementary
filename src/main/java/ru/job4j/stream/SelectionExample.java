package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl = strings
                .stream()
                .skip(2)
                .toList();
        System.out.println(rsl);

        List<String> strings1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl1 = strings1
                .stream()
                .limit(3)
                .toList();
        System.out.println(rsl1);

        List<String> strings3 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl3 = strings3
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(rsl3);

        List<String> strings4 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String rsl4 = strings4
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(rsl4);
    }
}