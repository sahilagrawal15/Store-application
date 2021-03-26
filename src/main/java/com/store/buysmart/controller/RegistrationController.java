package com.store.buysmart.controller;

import com.store.buysmart.model.Registration;
import com.store.buysmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public void save(@RequestBody Registration registration){
        userService.save(registration);
    }


}
