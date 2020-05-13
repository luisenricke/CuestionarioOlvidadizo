package com.luisenricke.cuestionarioolvidadizo.model;

public class Option {

    private int    id;
    private int    idQuestion;
    private String option;

    public Option() {
    }

    public Option(int id, int idQuestion, String option) {
        this.id = id;
        this.idQuestion = idQuestion;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
