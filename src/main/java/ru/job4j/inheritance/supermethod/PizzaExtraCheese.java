package ru.job4j.inheritance.supermethod;

public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
