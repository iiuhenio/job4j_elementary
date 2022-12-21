package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return multiply(d) + minus(d) + sum(d) + divide(d);
    }

    public static void main(String[] args) {
        System.out.println("Вызов статических методов:");
        System.out.println(Calculator.sum(10));
        System.out.println(Calculator.minus(10));
        System.out.println("Вызов не статических методов:");
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(10));
        System.out.println(calculator.multiply(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}