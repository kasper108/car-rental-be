package com.rasacode.carrental.enumeration;

public enum UserStatus {
    ADMIN("Administrator"),
    USER("User");

    public final String userStatus;

    UserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
