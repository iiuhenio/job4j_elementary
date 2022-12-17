package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl2 = (height - 110) * 1.15;
        return rsl2;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(175);
        System.out.println("Man 175 is " + man);
        double woman = Fit.womanWeight(165);
        System.out.println("Woman 165 is " + woman);
    }
}