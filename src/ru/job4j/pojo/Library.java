package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book pinokio = new Book("Pinokio", 4);
        Book mars = new Book("Mars", 15);
        Book jorney = new Book("Jorney", 27);
        Book cleancode = new Book("Clean code", 41);

        Book[] bookshelf = new Book[4];
        bookshelf[0] = pinokio;
        bookshelf[1] = mars;
        bookshelf[2] = jorney;
        bookshelf[3] = cleancode;
        for (int index = 0; index < bookshelf.length; index++) {
            Book bo = bookshelf[index];
            System.out.println(bo.getName() + " - " + bo.getCount());
        }
        System.out.println("replace Pinokio to Billionare");
        for (int index = 0; index < bookshelf.length; index++) {
            Book temp = bookshelf[0];
            bookshelf[0] = bookshelf[3];
            bookshelf[3] = temp;


            System.out.println(bookshelf[index].getName() + " - " + bookshelf[index].getCount());
        }
        System.out.println("show Clean code book");
        for (int index = 0; index < bookshelf.length; index++) {
            if (bookshelf[index].getName().equals("Clean code")) {

                System.out.println(bookshelf[index].getName() + " - " + bookshelf[index].getCount());
            }
        }
    }
}

