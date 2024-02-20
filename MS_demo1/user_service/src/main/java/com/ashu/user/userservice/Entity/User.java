package com.ashu.user.userservice.Entity;


import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;

    private String name;

    private String phone;

    List<Contacts> contacts = new ArrayList<>();



    // constructor with List<Contacts>
    public User(Long userId, String name, String phone, List<Contacts> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    // constructor without List<Contacts>
    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    // default Constructor
    public User() {
    }


    // getters & setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
