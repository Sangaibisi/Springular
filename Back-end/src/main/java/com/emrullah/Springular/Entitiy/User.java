package com.emrullah.Springular.Entitiy;

public class User {
    private int id;
    private String email;
    private int password;
    private boolean isCC=false;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isCC() {
        return isCC;
    }

    public void setCC(boolean CC) {
        isCC = CC;
    }

}
