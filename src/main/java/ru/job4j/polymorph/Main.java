package ru.job4j.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();

        TownCar townCar1 = new TownCar();
        townCar1.changeGear();
        townCar1.accelerate();
        townCar1.steer();
        townCar1.brake();
    }
}