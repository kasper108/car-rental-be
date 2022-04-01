package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.UserStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private String password;

    @Column(unique = true)
    @NotEmpty(message = "Email cannot be empty or null")
    private String email;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(referencedColumnName = "id")
    private Address address;
}
