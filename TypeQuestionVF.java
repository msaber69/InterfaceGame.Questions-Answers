package com.company;

public class TypeQuestionVF {
    private String choix1;
    private String choix2;
    private Question clQuestion;
    public TypeQuestionVF(Question clQuestion, String choix1, String choix2){
        this.clQuestion=clQuestion;
        this.choix1=choix1;
        this.choix2=choix2;
    }

    public Question getClQuestion() {
        return clQuestion;
    }

    public String getChoix1() {
        return choix1;
    }

    public String getChoix2() {
        return choix2;
    }
}
