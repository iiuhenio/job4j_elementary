package ru.job4j.oop;

public class Doctor extends Profession {
    private String age;
    private String skill;

    public Doctor(String name, String surname, String education, String birthday, String age, String skill) {
        super(name, surname, education, birthday);

        this.age = age;
        this.skill = skill;
    }

    Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}