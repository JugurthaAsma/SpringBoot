package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController{

    private String name = "Jugurtha";

    @GetMapping(value = {"/hello"})
    public String showIndexPage(Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
