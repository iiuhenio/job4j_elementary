package ru.job4j.oop;
public class Cat {


    private String name;
    private String food;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {

        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {

        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("съел");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
        System.out.println("съел");
    }
}
