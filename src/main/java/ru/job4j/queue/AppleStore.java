package ru.job4j.queue;

import java.util.Queue;

/**
 * Далее есть класс, описывающий магазин:
 */
public class AppleStore {

    /* поле Queue хранит в себе очередь клиентов, которые пришли в магазин */
    private final Queue<Customer> queue;

    /* поле count хранит в себе количество доступного к покупке товара */
    private final int count;

    /* конструктор класса AppleStore */
    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    /* должен вернуть имя последнего счастливого обладателя желаемого товара */
    public String getLastHappyCustomer() {
        int num = queue.size() - count;
        for (int i = 0; i < num; i++) {
            queue.poll();
        }
        return queue.element().name();
    }

    /* должен вернуть имя последнего счастливого обладателя желаемого товара */
    public String getLastUpsetCustomer() {
        int num = queue.size() - count;
        for (int i = 0; i <= num; i++) {
            queue.poll();
        }
        return queue.element().name();
    }
}