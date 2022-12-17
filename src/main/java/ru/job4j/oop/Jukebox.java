package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Певня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox petya1 = new Jukebox();
        petya1.music(1);
        petya1.music(2);
        petya1.music(3);
    }
}
