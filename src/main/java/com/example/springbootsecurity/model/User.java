package com.example.springbootsecurity.model;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="security_user")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
