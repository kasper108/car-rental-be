package com.rasacode.carrental.enumeration;

public enum TransmissionType {
    AUTO("Automatic"),
    MECH("Mechanic");


    public final String gearType;

    TransmissionType(String gearType) {
        this.gearType = gearType;
    }

    public String getGearType() {
        return gearType;
    }
}
