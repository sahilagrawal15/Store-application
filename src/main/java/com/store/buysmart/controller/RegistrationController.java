package com.store.buysmart.controller;

import com.store.buysmart.model.Registration;
import com.store.buysmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistrationController {

    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<Registration> save(@RequestBody Registration registration){
        return ResponseEntity.ok().body(userService.createUser(registration));
    }

    @GetMapping("/user")
    public ResponseEntity<List<Registration>> getUsers(){
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @GetMapping("user/{id}")
    public ResponseEntity<Registration> getUserById(@PathVariable(value = "id") int id){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }

    @DeleteMapping("user/{id}")
    public HttpStatus deleteUserById(@PathVariable(value = "id") int id){
        userService.deleteUserById(id);
        return HttpStatus.OK;
    }

    @PutMapping("user/{id}")
    public ResponseEntity<Registration> updateUser(@PathVariable(value = "id") int id,
                                                   @RequestBody Registration registration){
        registration.setRollNo(id);
        return ResponseEntity.ok().body(userService.updateUser(registration));
    }





}
