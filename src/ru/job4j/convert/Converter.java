package ru.job4j.convert;

public class Converter {


    public static int rubleToEuro(int value) {
        return value / 70;
    }


    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(120);
        System.out.println("120 dollars are " + dollar + " dollar. ");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}