package com.edomocar.webapp.AplicationWeb.controllers;

import com.edomocar.webapp.AplicationWeb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/user")
    public String details(Model model) {
        model.addAttribute("title", "DESARROLADOR");
        model.addAttribute("name", "EDU");
        model.addAttribute("lastName", "MORALES");
        model.addAttribute("edad", 21);
        return "user";
    }

    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title", "EQUIPOS DE COMPUTACION");
        model.put("name", "THINKPAD");
        model.put("model", 2024);

        return "details";
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        List<User> users = Arrays.asList(
                new User("EDU", "MORALES", 21),
                new User("JUAN", "PEREZ", 30, "juanperez@gmail.com"),
                new User("MARIA", "GOMEZ", 25, "mariagomez34@gmail.com"),
                new User("LEONARDO", "SUAREZ", 41),
                new User("SAMUEL", "CRUZ", 23),
                new User("LINEL", "PIXAS", 34, "line0z2pixas@gmail.com"));
        return users;
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        //List<User> users = new ArrayList<>();
            model.addAttribute("title", "LISTA DE USUARIOS");

        return "list";
    }
}
