package com.kata.loginapp;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(unique=true)
    @Size(min=5, message="Must contain at least 5 characters")
    @Pattern(regexp="([A-Za-z0-9])*", message="Must contain alpha-numeric characters only")
    public String name;

    @Size(min=8, message="Must contain at least 8 characters")
    @Pattern(regexp="^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).+$", message="Must contain at least 1 number, 1 uppercase, and 1 lowercase character")
    public String password;
}
