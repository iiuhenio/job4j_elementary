package ru.job4j.checkstyle;

public class Broken {
    final int sizeOfEmpty = 10;
    private String surname;
    private static final String NEW_VALUE = "";
    private String name;

    public void broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}