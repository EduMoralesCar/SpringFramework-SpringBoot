package com.edomocar.webapp.AplicationWeb.controllers;

import com.edomocar.webapp.AplicationWeb.models.User;
import com.edomocar.webapp.AplicationWeb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details() {

        User user = new User("EDU", "MORALES", 21);

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("DESARROLADOR");

        return userDto;
    }

    @GetMapping("list")
    public List<User> list() {

        User user1 = new User("Aldo", "Omar", 30);
        User user2 = new User("Odon", "Pedro", 32);
        User user3 = new User("Edu", "Morales", 21);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("ALDO", "MORALES", 30);
        Map<String, Object> body = new java.util.HashMap<>();

        body.put("title", "SENIOR");
        body.put("user", user);
        return body;
    }
}
