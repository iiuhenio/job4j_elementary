package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    /**
     * метод getEvenElements должен взять из очереди evenElements только четные символы и все их соберет в
     * результирующую строку. Для реализации вам понадобится цикл fori, строку формируйте с помощью StringBuilder.
     * Эта очередь всегда имеет четное число элементов;
     */
    private String getEvenElements() {
        StringBuilder sb = new StringBuilder(String.valueOf(evenElements));
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 != 0) {
                sb.deleteCharAt(i);
            }
        }
        return String.valueOf(sb);
    }

    /**
     * - метод getDescendingElements должен брать символы начиная с последнего символа и так пока не заберет их все.
     * Каждый символ мы добавляем в результирующую строку, формируем с помощью StringBuilder.
     */
    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder(String.valueOf(descendingElements));
        StringBuilder sb2 = new StringBuilder();
        sb.reverse();

        return String.valueOf(sb);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}