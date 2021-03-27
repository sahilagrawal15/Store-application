package com.store.buysmart.service;

import com.store.buysmart.model.Registration;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Registration createUser(Registration registration);
    List<Registration> getAllUser();
    Registration updateUser(Registration registration);
    void deleteUserById(int id);
    Registration getUserById(int id);
    void sendMail(Registration registration);
}
