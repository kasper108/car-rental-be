package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.FuelType;
import com.rasacode.carrental.enumeration.GearType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regCode;
    private String brand;
    private int year;
    @Enumerated(EnumType.STRING)
    private GearType gearAuto;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    private byte sitCount;
    private Double dayPrice;
}
