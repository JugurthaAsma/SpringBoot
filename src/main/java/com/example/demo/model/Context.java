package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class Context {
    private List<Person> persons;
    private List<Event> events;

    public Context() {
        this.persons = new ArrayList<>();
        this.events = new ArrayList<>();
        this.createContext();
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Event> getEvents() {
        return events;
    }

    private void createContext() {
        this.events.add(new Event(UUID.randomUUID(), "Jugurtha's birth day", LocalDate.now().toString()));
        this.events.add(new Event(UUID.randomUUID(), "Thibault's birth day", LocalDate.now().toString()));

        this.persons.add(new Person(UUID.randomUUID(), "Jugurtha", "Asma", this.events.get(1)));
        this.persons.add(new Person(UUID.randomUUID(), "Thibault", "LeMan", this.events.get(0)));
    }

    public void deletePerson(UUID id) {
        for(int index = 0; index <  persons.size(); ++index){
            if (persons.get(index).equals(id)) {
                this.persons.remove(index);
            }
        }
    }
}
