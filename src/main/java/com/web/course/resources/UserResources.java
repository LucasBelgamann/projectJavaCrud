package com.web.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.web.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "1234");
        return ResponseEntity.ok().body(u);
    }
    
}
