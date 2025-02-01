package com.phaete.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaete.backend.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
    User findByEmail(String email);
    User findByUsername(String username);
}
