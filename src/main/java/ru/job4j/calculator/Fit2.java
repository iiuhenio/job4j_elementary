package ru.job4j.calculator;

public class Fit2 {

        public static double manWeight(short height) {
            double rsl = (height - 100) * 1.15;
            return rsl;
        }

        public static double womanWeight(short height) {
            double rsl1 = (height - 110) * 1.15;
            return rsl1;
        }

        public static void main(String[] args) {

            double man = Fit.manWeight(187);
            System.out.println("Man 187 is " + man);

            double woman = Fit.womanWeight(187);
            System.out.println("Woman 187 is " + woman);
        }

    }
