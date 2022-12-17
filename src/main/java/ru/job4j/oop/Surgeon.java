package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String dayly;

    public Surgeon(String name, String surname, String education, String birthday, String age, String skill, String dayly) {
        super(name, surname, education, birthday, age, skill);

        this.dayly = dayly;
    }
}