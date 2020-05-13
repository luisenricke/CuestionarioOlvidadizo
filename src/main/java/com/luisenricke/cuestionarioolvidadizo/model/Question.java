package com.luisenricke.cuestionarioolvidadizo.model;

public class Question {

    private int    id;
    private int    idQuiz;
    private String question;
    private Type   type;

    public Question() {
    }

    public Question(int id, int idQuiz, String question, Type type) {
        this.id = id;
        this.idQuiz = idQuiz;
        this.question = question;
        this.type = type;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    enum Type {
        SHORT, LARGE, MULTIPLE, DROPDOWN, BINARY, DATE, HOUR, NUMBER, MEDIA
    }

}


