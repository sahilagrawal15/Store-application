package com.store.buysmart.service;

import com.store.buysmart.model.Registration;
import com.store.buysmart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JavaMailSender javaMailSender;


    @Override
    public Registration createUser(Registration registration) {
        return userRepository.save(registration);
    }

    @Override
    public List<Registration> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Registration updateUser(Registration registration) {
        Optional<Registration> registration2 = userRepository.findById(registration.getRollNo());
        Registration registrationUpdate = registration2.get();
        registrationUpdate.setRollNo(registration.getRollNo());
        registrationUpdate.setName(registration.getName());
        registrationUpdate.setPassword(registration.getPassword());
        registrationUpdate.setConfirmPassword(registration.getConfirmPassword());
        registrationUpdate.setCity(registration.getCity());
        registrationUpdate.setPhone(registration.getPhone());
        return registrationUpdate;
    }

    @Override
    public void deleteUserById(int id) {
        Optional<Registration> registration = userRepository.findById(id);
        if (registration.isPresent()) {
            userRepository.delete(registration.get());
        } else
            System.out.println("Not present");
    }

    @Override
    public Registration getUserById(int id) {
        Optional<Registration> registration = userRepository.findById(id);
        return registration.get();
    }

    public void sendMail(Registration registration) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(registration.getName());
        mailMessage.setSubject("Welcome to Online Store Application");
        mailMessage.setText("Hey There!\n" +
        "We are pleased to have you, we are currently under development " +
                "and will bring to you all kinds if goods and accessories at your doorstep at earlier.\n\n" +
        "Warm Regards\n" +
        "Online Store Team");
        javaMailSender.send(mailMessage);
    }
}
