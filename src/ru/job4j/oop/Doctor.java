package ru.job4j.oop;

public class Doctor extends Profession {
    private String age;
    private String skill;

    public Doctor() {

    }

    public Doctor(String name, String surname, String education, String birthday, String skill) {
        super(name, surname, education, birthday);

        this.skill = skill;



    }

}