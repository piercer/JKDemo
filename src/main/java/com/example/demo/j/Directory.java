package com.example.demo.j;

import com.example.demo.k.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Directory {

    private final List<Person> people = new ArrayList<>();

    public void addPerson(String firstName, String lastName, int age) {
        var person = new Person(firstName, lastName, age);
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }

}
