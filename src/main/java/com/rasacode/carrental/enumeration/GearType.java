package com.rasacode.carrental.enumeration;

public enum GearType {
    AUTO("Automatic"),
    MECH("Mechanic");

    public final String gearType;

    GearType(String gearType) {
        this.gearType = gearType;
    }

    public String getGearType() {
        return gearType;
    }
}
