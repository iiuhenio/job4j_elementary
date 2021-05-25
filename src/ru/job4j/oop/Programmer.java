package ru.job4j.oop;

public class Programmer extends Engineer {

    private String gender;

    public Programmer(String name, String surname, String education, String birthday, String gender, String age, String skill) {
        super(name, surname, education, birthday, age, skill);

        this.gender = gender;
    }
}