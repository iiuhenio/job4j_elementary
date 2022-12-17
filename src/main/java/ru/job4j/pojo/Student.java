package ru.job4j.pojo;

import java.util.Date;

public class Student {
    public String name;
    public String groupNumber;
    public Date data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date;
    }
}
