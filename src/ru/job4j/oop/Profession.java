package ru.job4j.oop;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {}
    public String getSurname() {}
    public String getEducation() {}
    public String getBirthday() {}



public class Engineer extends Profession {
    private String age;
    private String skill;
}

public class Doctor extends Profession {
    private String age;
    private String skill;

    Diagnosis heal(Pacient pacient) {}
}

public class Surgeon extends Doctor {
    private String skinColor;
    private String sex;
}

public class Dentist extends Doctor {
    private String skinColor;
    private String sex;
}

public class Builder extends Engineer {
    private String skinColor;
    private String sex;
}

public class Programmer extends Engineer {
    private String skinColor;
    private String sex;
}



}

