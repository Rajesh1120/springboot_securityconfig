package com.example.springbootsecurity.repository;

import com.example.springbootsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface myrepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
