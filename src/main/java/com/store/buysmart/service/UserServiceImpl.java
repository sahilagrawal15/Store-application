package com.store.buysmart.service;

import com.store.buysmart.model.Registration;
import com.store.buysmart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(Registration registration) {
        userRepository.save(registration);
    }

    @Override
    public List<Registration> findAll() {
        List<Registration> list;
        list = userRepository.findAll();
        return list;
    }

   /* @Override
    public void deleteById(int id) {
        Optional<Registration> registration = userRepository.findById(id);
        userRepository.delete(registration);
    }*/

    @Override
    public Optional<Registration> findById(int id) {
        Optional<Registration> registration = userRepository.findById(id);
        return registration;

        }

}
