package ru.job4j.converter;

public class Converter2 {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter2.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter2.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = Converter2.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter2.rubleToDollar(in);
        boolean passed1 = expected == out;
        System.out.println("140 rubles are 3. Test result : " + passed);
    }
}