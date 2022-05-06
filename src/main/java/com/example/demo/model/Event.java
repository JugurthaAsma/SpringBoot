package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "EVENT")
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String date;

    public Event() {}

    public Event(UUID id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
