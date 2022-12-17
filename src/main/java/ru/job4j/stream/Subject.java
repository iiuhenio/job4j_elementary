package ru.job4j.stream;

/**
 * Класс Subject описывает школьный предмет и аттестационный балл ученика.
 */
public class Subject {
    private String name;
    private int score;

    /**
     *
     * @param name - это имя ученика
     * @param score - это аттестационный бал ученика
     */
    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}