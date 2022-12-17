package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error error = new Error(true, 21, "Yes");
        error.printInfo();
        Error err = new Error(false, 25, "No");
        err.printInfo();

    }

    public void printInfo() {
            System.out.println("активен: " + active);
            System.out.println("количество: " + status);
            System.out.println("в наличии на складе: " + message);
        }
    }




