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
        Deque<Character> rsl;
        for (int i = 0; i < evenElements.size(); i++) {
            if (i % 2 != 0) {
                evenElements.pop();
            }
        }
        return String.valueOf(evenElements);
    }

    /**
     * - метод getDescendingElements должен брать символы начиная с последнего символа и так пока не заберет их все.
     * Каждый символ мы добавляем в результирующую строку, формируем с помощью StringBuilder.
     */
    private String getDescendingElements() {
        Deque<Character> rsl = null;
        for (int i = 0; i < descendingElements.size(); i++) {
            Character ch = descendingElements.pollLast();
            rsl.addFirst(ch);
        }
        return String.valueOf(rsl);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}