package ru.job4j.ahaha;

import java.util.LinkedList;
import java.util.Queue;

public class AahahUsage2 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        for (int i = 0; i < 3; i++) {
            queue.poll();
        }

        System.out.println(queue);
        System.out.println(queue.size());
    }
}

