package com.herbecha.app.model.dto;

public class UserDto {

    String firstname;
    String lastname;
    String email;
    String password;
    String address;
    String cp;
    String city;

    public UserDto() {
    }

    public UserDto(String email, String password, String address, String cp, String city) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.cp = cp;
        this.city = city;
    }

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserDto(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public UserDto(String firstname, String lastname, String email, String password, String address, String cp, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.address = address;
        this.cp = cp;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
