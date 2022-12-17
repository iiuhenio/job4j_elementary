package ru.job4j.oop;

public class Dentist extends Doctor {
    private String skinColor;

    public Dentist(String name, String surname, String education, String birthday, String age, String skill, String skinColor) {
        super(name, surname, education, birthday, age, skill);

        this.skinColor = skinColor;
    }
}
