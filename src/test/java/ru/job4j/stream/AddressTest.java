package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddressTest {
    @Test
    public void whenCollectAddress() {
        Address address1 = new Address("Moscow", "strit1", 1, 1);
        Address address2 = new Address("Kiev", "strit2", 2, 2);
        Address address3 = new Address("Kazan", "strit3", 3, 3);

        Profile profile1 = new Profile(address1, "Slava");
        Profile profile2 = new Profile(address2, "Vova");
        Profile profile3 = new Profile(address3, "Sergey");

        List<Profile> listProf = List.of(profile1, profile2, profile3);

        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(listProf);
        List<Address> expected = List.of(address1, address2, address3);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectAddressThree() {
        Address address1 = new Address("Moscow", "strit1", 1, 1);
        Address address2 = new Address("Kiev", "strit2", 2, 2);
        Address address3 = new Address("Abakan", "strit3", 3, 3);
        Address address4 = new Address("New York", "strit4", 4, 4);

        Profile profile1 = new Profile(address1, "Slava");
        Profile profile2 = new Profile(address2, "Vova");
        Profile profile3 = new Profile(address3, "Sergey");
        Profile profile4 = new Profile(address4, "Sergey");
        Profile profile5 = new Profile(address4, "Oleg");

        List<Profile> listProf = List.of(profile1, profile2, profile3, profile4, profile5);

        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.sorted(listProf);
        List<Address> expected = List.of(address3, address2, address1, address4);
        assertThat(rsl, is(expected));
    }
}