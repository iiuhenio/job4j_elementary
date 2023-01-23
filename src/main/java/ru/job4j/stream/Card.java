package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                System.out.println(suit + " " + value);
            }
        }

        System.out.println("=== Using stream ===");
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }
}