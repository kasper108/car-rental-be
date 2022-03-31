package com.rasacode.carrental.enumeration;

public enum UserStatus {
    ADMIN("ADMIN"),
    USER("USER");

    public final String userStatus;

    UserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
