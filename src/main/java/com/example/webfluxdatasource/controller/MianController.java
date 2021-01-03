package com.example.webfluxdatasource.controller;

import com.example.webfluxdatasource.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/datasource")
public class MianController {

    @GetMapping("/string")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getString() {
        return "web flux string test";
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("abc");
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/user-list")
    public ResponseEntity<List<User>> getUserList() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUserId(1L);
        user.setUsername("abc");
        userList.add(user);
        userList.add(user);
        userList.add(user);
        return ResponseEntity.ok().body(userList);
    }

}
