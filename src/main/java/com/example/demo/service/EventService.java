package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService {

    @Autowired
    public EventRepository eventRepository;
/*
    void save(Event event){

    }

    void saveAll(Iterable<Event> events){

    }

    Event findById(UUID id){

    }

    boolean existsById(UUID id){

        return true
    }

    void deleteById(UUID id){

    }

    void delete(Event event){

    }

    void deleteAll(){

    }

 */

}
