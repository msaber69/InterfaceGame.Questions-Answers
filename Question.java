package com.company;

import java.util.List;

public class Question {
    private String theme;
    private int difficulte;
    private String quest;
    private String reponse;
    private List<String> ListeUniquementQuestion;

    public Question(String theme, int difficulte, String quest, String reponse){
        this.theme=theme;
        this.quest=quest;
        this.reponse=reponse;
        this.difficulte=difficulte;
    }
    public void ajouterQuestion(){
        this.ListeUniquementQuestion.add(quest);
    }
    public void suppressionQuestion(int rang){
        this.ListeUniquementQuestion.remove(rang);
    }

    public String getTheme() {
        return theme;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public String getQuest() {
        return quest;
    }

    public String getReponse() {
        return reponse;
    }

}
