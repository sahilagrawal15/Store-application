package com.store.buysmart.service;

import com.store.buysmart.model.Registration;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(Registration registration);
    List<Registration> findAll();
/*
    void deleteById(int id);
*/
    Optional<Registration> findById(int id);
}
