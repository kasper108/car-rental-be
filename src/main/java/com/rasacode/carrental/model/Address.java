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

    @Column(name = "street_name", nullable = false)
    private String streetName;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "country", nullable = false)
    @Enumerated(EnumType.STRING)
    private Country country;
}
