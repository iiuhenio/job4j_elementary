package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorEncByName() {
        Comparator<Job> cmpName = new JobEncByNameLn();
        int rsl = cmpName.compare(
                new Job("Push button", 3),
                new Job("Shift cartoon", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpName = new JobEncByNameLn();
        int rsl = cmpName.compare(
                new Job("Push button", 3),
                new Job("Shift cartoon", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> cmpName = new JobEncByNameLn();
        int rsl = cmpName.compare(
                new Job("Push button", 3),
                new Job("Shift cartoon", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorEncByPriority() {
        Comparator<Job> cmpName = new JobEncByNameLn();
        int rsl = cmpName.compare(
                new Job("Push button", 3),
                new Job("Shift cartoon", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorEncByNameAndEncPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}