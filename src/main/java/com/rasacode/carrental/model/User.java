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
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "user_id", referencedColumnName = "id")
    //List<Reservation> reservations = new ArrayList<>();
}
