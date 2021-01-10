package com.models;

public class Demand {
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String dobLocation;
    private String address;
    private String email;
    private String phoneNumberOne;
    private String phoneNumberTow;
    private boolean acknowledgement;

    public Demand(String firstName, String lastName, String gender, String dob, String dobLocation, String address, String email, String phoneNumberOne, String phoneNumberTow, boolean acknowledgement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.dobLocation = dobLocation;
        this.address = address;
        this.email = email;
        this.phoneNumberOne = phoneNumberOne;
        this.phoneNumberTow = phoneNumberTow;
        this.acknowledgement = acknowledgement;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDobLocation() {
        return dobLocation;
    }

    public void setDobLocation(String dobLocation) {
        this.dobLocation = dobLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumberOne() {
        return phoneNumberOne;
    }

    public void setPhoneNumberOne(String phoneNumberOne) {
        this.phoneNumberOne = phoneNumberOne;
    }

    public String getPhoneNumberTow() {
        return phoneNumberTow;
    }

    public void setPhoneNumberTow(String phoneNumberTow) {
        this.phoneNumberTow = phoneNumberTow;
    }

    public boolean getAcknowledgement() {
        return acknowledgement;
    }

    public void setAcknowledgement(boolean acknowledgement) {
        this.acknowledgement = acknowledgement;
    }
}