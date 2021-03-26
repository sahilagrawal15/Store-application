package com.store.buysmart.service;

import com.store.buysmart.model.Registration;
import com.store.buysmart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(Registration registration) {
        userRepository.save(registration);
    }
}
