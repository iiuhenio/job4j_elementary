package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        int monDay = 0;
        int monEvn = 0;
        int toDay = 0;
        int toEvn = 0;
        int wenDay = 0;
        int wenEvn = 0;
        int thuDay = 0;
        int thuEvn = 0;
        int friDay = 0;
        int friEvn = 0;
        int satDay = 0;
        int satEvn = 0;
        int sunDay = 0;
        int sunEvn = 0;

        if (hours[0] <= 8) {
            monDay = hours[0] * 10;
        }
        if (hours[0] > 8) {
            monEvn = 80 + (hours[0] - 8) * 15;
        }
        if (hours[1] <= 8) {
            toDay = hours[1] * 10;
        }
        if (hours[1] > 8) {
            toEvn = 80 + (hours[1] - 8) * 15;
        }
        if (hours[2] <= 8) {
            wenDay = hours[2] * 10;
        }
        if (hours[2] > 8) {
            wenEvn = 80 + (hours[2] - 8) * 15;
        }
        if (hours[3] <= 8) {
            thuDay = hours[3] * 10;
        }
        if (hours[3] > 8) {
            thuEvn = 80 + (hours[3] - 8) * 15;
        }
        if (hours[4] <= 8) {
            friDay = hours[4] * 10;
        }
        if (hours[4] > 8) {
            friEvn = 80 + (hours[4] - 8) * 15;
        }
        if (hours[5] <= 8) {
            satDay = hours[5] * 20;
        }
        if (hours[5] > 8) {
            satEvn = 160 + (hours[5] - 8) * 30;
        }
        if (hours[6] <= 8) {
            sunDay = hours[6] * 20;
        }
        if (hours[6] > 8) {
            sunEvn = 160 + (hours[6] - 8) * 30;
        }

        rsl = monDay + monEvn + toDay + toEvn + wenDay + wenEvn + thuDay + thuEvn + friDay + friEvn + satDay + satEvn + sunDay + sunEvn;
        return rsl;
    }
}


