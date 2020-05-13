package com.luisenricke.cuestionarioolvidadizo.model;

public class User {

    private int    id;
    private int    idUserType;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, int idUserType, String username, String password) {
        this.id = id;
        this.idUserType = idUserType;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
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
}
