package ru.job4j.condition;

public class LogicOr {
    public static boolean check(int num) {
        if ((num % 2 != 0) || (num < 0)) {
            return true;
        }
            return false;
        }
    }
