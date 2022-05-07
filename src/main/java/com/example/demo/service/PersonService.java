package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;





    /*
    public List<Person> getAllPersons() {
        return getPersons();
    }

    public void addPerson(Person person) {
        context.getPersons().add(person);
    }

    public void deletePerson(UUID id) {
        context.deletePerson(id);


    }

     */
}
