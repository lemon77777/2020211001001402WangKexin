package com.WangKexin.model;

import java.util.Date;

public class Users {
    private int id;
    private String username;
    private String password;
    private String email;
    private String gender;
    private Date birth;

    public Users() {
    }

    public Users(int id, String username, String password, String email, String gender, Date birth) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                '}';
    }
}
