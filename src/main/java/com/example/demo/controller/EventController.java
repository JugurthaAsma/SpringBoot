package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.service.EventService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping(value = {"/events"})
    public String showPersonListPage(Model model) {
        model.addAttribute("events", eventService.eventRepository.findAll());
        return "event/eventList";
    }

    @PostMapping(value = {"/event"})
    public String showAddPersonPage(Model model) {

        return showPersonListPage(model);
    }

}
