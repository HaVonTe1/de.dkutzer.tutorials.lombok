package de.dkutzer.tut.lombok.EqualsAndHashCode;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(exclude = { "address" })
public class EqualsAndHashCodeDemo {

    enum Gender {
        Male, Female
    }

    @NonNull
    private String name;
    @NonNull
    private Gender gender;

    private String ssn;
    private String address;

    public static void main(String[] args) {
        EqualsAndHashCodeDemo ringo = new EqualsAndHashCodeDemo();
        ringo.name = "Starr";
        ringo.gender = Gender.Male;
        ringo.ssn = "1";
        ringo.address = "Liverpool";

        EqualsAndHashCodeDemo john = new EqualsAndHashCodeDemo();
        john.name = "Lennon";
        john.gender = Gender.Male;
        john.ssn = "2";
        john.address = "Liverpool";

        System.out.println(ringo.equals(john));// false

        // move ringo to london -- still the same person
        EqualsAndHashCodeDemo ringo2 = new EqualsAndHashCodeDemo();
        ringo2.name = "Starr";
        ringo2.gender = Gender.Male;
        ringo2.ssn = "1";
        ringo2.address = "London";

        System.out.println(ringo.equals(ringo2));// true

    }
}
