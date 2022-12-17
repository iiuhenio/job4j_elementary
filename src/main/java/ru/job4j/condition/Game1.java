package ru.job4j.condition;

public class Game1 {
    public static int checkGame(double percent, int prize, int pay) {
        double pa = pay;
        double pr = prize;
        double rsl = 0;
        if ((percent * prize) > pay) {
            rsl = (percent * pr) - pa;
        } else {
            rsl = 0;
        }
        return (int) rsl;
    }
}
