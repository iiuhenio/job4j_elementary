package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle coach = new Coach();

        Vehicle[] vehicles = new Vehicle[]{plane, train, coach};
        for (Vehicle a : vehicles) {
            a.move();
            a.passengers(100);
        }
    }
}

