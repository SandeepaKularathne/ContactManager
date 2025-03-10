package com.contactmanager;

public class Contact {

    private String name;
    private String mobile;
    private String email;

    // Constructor
    public Contact(String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    // Getters and setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getMobile() { return mobile; }

    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email;}
}
