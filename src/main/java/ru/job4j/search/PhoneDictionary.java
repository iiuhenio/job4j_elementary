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

        Predicate<String> combineName = x -> x.contains(key);
        Predicate<String> combineSurname = x -> x.contains(key);
        Predicate<String> combinePhone = x -> x.contains(key);
        Predicate<String> combineAddress = x -> x.contains(key);

        Predicate<Person> combine = x -> combineName.test(x.getName())
                || combineSurname.test(x.getSurname())
                || combinePhone.test(x.getPhone())
                || combineAddress.test(x.getAddress());

        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}