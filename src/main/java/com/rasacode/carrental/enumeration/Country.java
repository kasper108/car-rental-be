package com.rasacode.carrental.enumeration;

public enum Country {
    LT("Lithuania"),
    EST("Estonia"),
    LV("Latvia");

    public final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
}
