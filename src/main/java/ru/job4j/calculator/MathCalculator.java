package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return division(first, second)
                + subtraction(first, second);
    }

    public static double sumAll(double first, double second) {
        double one = sumAndMultiply(first, second);
        double two = divAndSub(first, second);
        return one + two;
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета2 равен: " + divAndSub(10, 20));
        System.out.println("Результат вычисления всех операций: " + sumAll(10, 20));
    }
}