package it.develhope.dbnoSQLOrm.controllers;

import it.develhope.dbnoSQLOrm.entities.User;
import it.develhope.dbnoSQLOrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user){
         return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userRepository.findById(id);
    }

}
