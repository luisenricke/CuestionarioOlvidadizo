package com.luisenricke.cuestionarioolvidadizo.model;

import java.util.Date;

public class Quiz {
    private int    id;
    private int    idUser;
    private String name;
    private String description;
    private Date   expired_at;
    // TODO: Check if we handle the variable of created and deleted
    // private Date created_at;
    // private Date deleted_at;

    public Quiz() {
    }

    public Quiz(int id, int idUser, String name, String description, Date expired_at) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.description = description;
        this.expired_at = expired_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpired_at() {
        return expired_at;
    }

    public void setExpired_at(Date expired_at) {
        this.expired_at = expired_at;
    }
}
