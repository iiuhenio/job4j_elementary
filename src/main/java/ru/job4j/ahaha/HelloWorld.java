package ru.job4j.ahaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World");
        List<Integer> data = new ArrayList(list);
        Integer intNumber = data.get(0);
        System.out.println(data);
    }
}
