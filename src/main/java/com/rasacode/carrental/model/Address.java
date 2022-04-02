package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.Country;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    private String houseNumber;
    private String flatNumber;
    private String city;
    private String zipCode;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Country country;

}
