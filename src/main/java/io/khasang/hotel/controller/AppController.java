package io.khasang.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//controller MVC
@Controller
public class AppController {

    @RequestMapping("/")
    public String helloPage(Model model) {
        model.addAttribute("name", "Jack Vorobey");
        return "hello";
    }
}
