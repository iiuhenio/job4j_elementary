package ru.job4j.search;


import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertEquals(persons.get(0).getSurname(), "Arsentev");
    }

    @Test
    public void cantFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("333");
        assertEquals(persons.size(), 0);
    }
}

