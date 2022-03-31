package com.rasacode.carrental.repository;

import com.rasacode.carrental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserById(Long id);
    void deleteUserById(Long id);
}
