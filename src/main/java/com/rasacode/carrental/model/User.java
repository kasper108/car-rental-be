package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private Date birthDate;         //1978-11-11
    private Long addressId;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String email;
    private String password;
}
