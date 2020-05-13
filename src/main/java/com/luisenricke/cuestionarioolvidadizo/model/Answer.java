package com.luisenricke.cuestionarioolvidadizo.model;

public class Answer {

    private int    id;
    private int    idKey;
    private int    idQuestion;
    private int    idOption;
    private String answer;

    public Answer() {
    }

    public Answer(int id, int idKey, int idQuestion, int idOption, String answer) {
        this.id = id;
        this.idKey = idKey;
        this.idQuestion = idQuestion;
        this.idOption = idOption;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKey() {
        return idKey;
    }

    public void setIdKey(int idKey) {
        this.idKey = idKey;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdOption() {
        return idOption;
    }

    public void setIdOption(int idOption) {
        this.idOption = idOption;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
