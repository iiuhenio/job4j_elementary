package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Антон Иванов");
        student.setGroupNumber("3");
        student.setDate(new Date());

        System.out.println(student.getName() + ", группа № " + student.getGroupNumber() + ", зачислен " + student.getDate());
    }
}
