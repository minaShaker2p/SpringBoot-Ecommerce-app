package com.mina.springbootecommerceapp.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
@Data
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private long userId;

    @NonNull
    @Column(name = "last_name")
    private String lastName;

    @NonNull
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @Column(name = "user_email")
    private String email;

    @NonNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "address")
    private String address;

}
