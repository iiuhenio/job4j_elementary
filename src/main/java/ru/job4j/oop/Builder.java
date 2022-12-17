package ru.job4j.oop;

public class Builder extends Engineer {
    private String stage;

    public Builder(String name, String surname, String education, String birthday, String stage, String age, String skill) {
        super(name, surname, education, birthday, age, skill);

        this.stage = stage;
    }
}