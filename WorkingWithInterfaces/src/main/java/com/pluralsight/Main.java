package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myClass = new ArrayList<>();
        myClass.add(new Person("Mo", "Jami", 23));
        myClass.add(new Person("Kevin", "Rosengren", 25));
        myClass.add(new Person("Sean", "Smith", 22));
        myClass.add(new Person("Mahlet", "Tefera", 20));
        myClass.add(new Person("Izel", "Ozhan", 22));



        Collections.sort(myClass); // sorts by last name

        // Print the sorted list
        for (Person person : myClass) {
            System.out.println(person.firstName + " " + person.lastName + ", age " + person.age);
        }
    }
}
