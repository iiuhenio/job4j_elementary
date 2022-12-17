package ru.job4j.ahaha;

public class AhahahUsage implements Interface1 {

    public void ahaha() {
        System.out.println("Смеемся");
    }

    public static void main(String[] args) {
        AhahahUsage ah = new AhahahUsage();
        ah.ahaha();
    }
}
