package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.service.EventService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping(value = {"/events"})
    public String showPersonListPage(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "event/eventList";
    }

    @GetMapping(value = {"/event/add"})
    public String showAddPersonPage(Model model) {

        return "event/addEvent";
    }

}
