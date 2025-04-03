package com.example.form.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int formid;
    private String username;
    private String password;
    private String email;
    private String phone;

    // Default constructor
    public Forms() {
    }

    // Getters and Setters
    public int getFormid() {
        return formid;
    }

    public void setFormid(int formid) {
        this.formid = formid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Forms [formid=" + formid + ", username=" + username + ", password=" + password + ", email=" + email
                + ", phone=" + phone + "]";
    }
}
