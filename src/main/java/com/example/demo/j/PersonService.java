package com.example.demo.j;

import com.example.demo.k.PersonLoader;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PersonService {

    private PersonLoader personlLoader;

    public PersonService(PersonLoader personlLoader) {
        this.personlLoader = personlLoader;
    }

    @PostConstruct
    public void startup() {
        personlLoader.addUsers();
        var directory = personlLoader.getDirectory();
        directory.getPeople().forEach(p -> System.out.println("Person: " + p));
    }

}
