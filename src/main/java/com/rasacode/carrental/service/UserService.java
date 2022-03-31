package com.rasacode.carrental.service;

import com.rasacode.carrental.exception.UserNotFoundException;
import com.rasacode.carrental.model.User;
import com.rasacode.carrental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteUserById(id);
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id).
                orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found" ));
    }
}
