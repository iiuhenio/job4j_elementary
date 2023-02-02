package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {

        var result = new ArrayList<Person>();

        Predicate<Person> combineName = x -> x.getName().contains(key);
        Predicate<Person> combineSurname = x -> x.getSurname().contains(key);
        Predicate<Person> combinePhone = x -> x.getPhone().contains(key);
        Predicate<Person> combineAddress = x -> x.getAddress().contains(key);

        Predicate<Person> combine = combineName.or(combineSurname).or(combinePhone).or(combineAddress);

        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}