package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class PersonController extends BaseController {

    @Autowired
    PersonService personService;

    @GetMapping(value = {"/persons"})
    public String showPersonListPage(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        model.addAttribute("newPerson", new Person());
        return "person:/personList";
    }

    @PostMapping(value = {"/person"})
    public String AddPerson(Model model, Person person) {
        person.setId(UUID.randomUUID());
        personService.addPerson(person);
        return showPersonListPage(model);
    }

    @PostMapping(value = {"/person/delete/{id}"})
    public String deletePerson(Model model, @PathVariable("id") UUID id) {
        personService.deletePerson(id);
        return showPersonListPage(model);
    }

}
