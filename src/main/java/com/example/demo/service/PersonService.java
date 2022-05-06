package com.example.demo.service;

import com.example.demo.model.Context;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    private Context context;

    public List<Person> getAllPersons() {
        return context.getPersons();
    }

    public void addPerson(Person person) {
        context.getPersons().add(person);
    }

    public void deletePerson(UUID id) {
        context.deletePerson(id);
    }
}
