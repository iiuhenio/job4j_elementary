package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        if (answer == 0) {
            System.out.println("да");
        } else if (answer == 1) {
            System.out.println("нет");
        } else {
            System.out.println("может быть");
        }
    }
}
