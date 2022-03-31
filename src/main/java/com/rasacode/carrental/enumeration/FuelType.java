package com.rasacode.carrental.enumeration;

public enum FuelType {
    PETROL("PETROL"),
    DIESEL("DIESEL"),
    ELECTRIC("ELECTRIC"),
    HYBRID("HYBRID");

    private final String fuelType;

    FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }
}
