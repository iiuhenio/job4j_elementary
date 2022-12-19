package ru.job4j.loop;

import java.util.Scanner;

public class DoExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        while (true) {
            password = scanner.nextInt();
            if (password == 555) {
                System.out.println("Successfully!");
            }
        }
    }
}