package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Stepan");
        names.add("Ivan");

        for (String value : names) {
            System.out.println(value);
        }
    }
}
