package ru.job4j.oop;

public class Engineer extends Profession {
    private String age;
    private String skill;

    public Engineer(String name, String surname, String education, String birthday, String age, String skill) {
        super(name, education, surname, birthday);

        this.age = age;
        this.skill = skill;
    }
}




