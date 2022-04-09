package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.FuelType;
import com.rasacode.carrental.enumeration.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reg_code", nullable = false, unique = true)
    private String regCode;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "sit_count", nullable = false)
    private int sitCount;

    @Column(name = "day_price", nullable = false)
    private Double dayPrice;

    @Column(name = "transmission", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission;

    @Column(name = "fuel_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
}
