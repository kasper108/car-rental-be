package com.rasacode.carrental.enumeration;

public enum UserType {
    ADMIN("Administrator"),
    USER("User");

    public final String userStatus;

    UserType(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
