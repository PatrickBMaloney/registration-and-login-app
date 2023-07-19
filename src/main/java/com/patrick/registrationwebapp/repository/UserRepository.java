package com.patrick.registrationwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.registrationwebapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}