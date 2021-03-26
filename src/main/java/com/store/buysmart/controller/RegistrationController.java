package com.store.buysmart.controller;

import com.store.buysmart.model.Registration;
import com.store.buysmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistrationController {

    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public void save(@RequestBody Registration registration){
        userService.save(registration);
    }

    @GetMapping("/user")
    public List<Registration> getUsers(){
        return userService.findAll();
    }
    @GetMapping("user/{id}")
    public ResponseEntity<Optional<Registration>> getUserById(@PathVariable(value = "id") int id){
        Optional<Registration> registration = userService.findById(id);
        return ResponseEntity.ok().body(registration);
    }
    /*@DeleteMapping("user/{id}")
    public void deleteUserById(@PathVariable(value = "id") int id){
        userService.deleteById(id);
    }*/



}
