package ru.job4j.poly;

public class Coach implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " везет детей на экскурсию");
    }

    @Override
    public void passengers(int count) {
        System.out.println(getClass().getSimpleName() + " количество пассажиров: " + count);
    }
}
