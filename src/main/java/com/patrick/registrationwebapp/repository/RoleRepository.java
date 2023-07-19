package com.patrick.registrationwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.registrationwebapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}