package com.luisenricke.cuestionarioolvidadizo.model;

public class Key {

    private int    id;
    private int    idQuiz;
    private String generation;

    public Key() {
    }

    public Key(int id, int idQuiz, String generation) {
        this.id = id;
        this.idQuiz = idQuiz;
        this.generation = generation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(int idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}
