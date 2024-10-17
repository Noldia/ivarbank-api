package com.api.ivarbank.service;

import com.api.ivarbank.entity.User;
import com.api.ivarbank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String username) {
        userRepository.delete(userRepository.findByUsername(username));
    }

    public boolean loginTemp(String username, String password) {
        boolean exist = userRepository.existsByUsername(username);

        if (exist) {
            User user = userRepository.findByUsername(username);
            return user.getPassword().equals(password);
        }
        return false;
    }
}
