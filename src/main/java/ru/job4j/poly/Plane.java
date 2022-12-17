package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит высоко в небе");
    }

    @Override
    public void passengers(int count) {
        System.out.println(getClass().getSimpleName() + " количество пассажиров: " + count);
    }
}
