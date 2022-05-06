package com.example.demo.service;

import com.example.demo.model.Context;
import com.example.demo.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private Context context;

    public List<Event> getAllEvents() {
        return context.getEvents();
    }

}
