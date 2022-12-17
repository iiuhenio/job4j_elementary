package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70.0;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl2 = value / 60.0;
        return rsl2;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140.0);
        double dollar = Converter.rubleToDollar(140.0);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
