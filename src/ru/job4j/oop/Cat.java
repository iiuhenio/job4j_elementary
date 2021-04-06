package ru.job4j.oop;

public class Cat {
    private String food; /* создали поле класса Кат - фуд */
    private String name; /* 1. создали поле класс Кат - нэйм */

    public void show() { /* выводит на консоль содержимое поля фуд */
        System.out.println(this.food);  /* пишем this выводим содержимое поля */
        System.out.println(this.name);

    }

    public void eat(String meat) {    /* записываем в поле объекта данные */
        this.food = meat;             /* Выше приведенная строчка записывает в поле объект food значение переменной
                                          meat. Значение переменной meat присваивается в методе main: */
    }
    public void giveNick(String nick) {    /* 2 */
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        System.out.print("съел ");
        gav.eat("kotleta");                                                     /* объект класса Cat gav*/
        gav.show();                                                    /*   Значение переменной meat присваивается в методе main: */
                                                               /* вызываем метод show у gav */

        Cat black = new Cat();                                 /* Объект класса Gav black */
        black.giveNick("Black");
        System.out.print("съел ");
        black.eat("fish");
        black.show();                                        /* вызываем метод show у black*/
    }
    }
