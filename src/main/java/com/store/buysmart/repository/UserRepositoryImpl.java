package com.store.buysmart.repository;

import com.store.buysmart.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class UserRepositoryImpl implements UserRepository{

    @Autowired
    UserRepository userRepository;

    @Override
    public Registration save(Registration registration) {
        userRepository.save(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        List<Registration> list;
        list = userRepository.findAll();
        return list;
    }

    @Override
    public Optional<Registration> findById(int id) {
        Optional<Registration> registration = userRepository.findById(id);
        return registration;    }

       /* @Override
    public void deleteById(int id){
            Registration registration = userRepository.findById(id);
            userRepository.delete(registration);
        }*/



}
