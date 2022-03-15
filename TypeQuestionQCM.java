package com.company;

public class TypeQuestionQCM {
    private String choix1;
    private String choix2;
    private String choix3;
    private Question clQuestion;
    public TypeQuestionQCM(Question clQuestion, String choix1, String choix2, String choix3){
        this.clQuestion=clQuestion;
        this.choix1=choix1;
        this.choix2=choix2;
        this.choix3=choix3;
    }

    public Question getClQuestion() {
        return clQuestion;
    }

    public String getChoix3() {
        return choix3;
    }

    public String getChoix2() {
        return choix2;
    }

    public String getChoix1() {
        return choix1;
    }
}
