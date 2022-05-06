package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;
    private Event event;

    public Person() {
        this.event = new Event();
    }

    public Person(UUID id, String firstName, String lastName, Event event) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.event = event;
    }

    public Person(UUID id, String firstName, String lastName) {
        this(id, firstName, lastName, null);
    }

    @Id
    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Event getEvent() {
        return event;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


}
