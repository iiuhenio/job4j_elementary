package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Driving");

    }

    @Override
    public void passengers(int count) {
        System.out.println("Passangers: " + count);

    }

    @Override
    public double refuel(double petrol) {
        int price = 50;
        return petrol * price;
    }
}
