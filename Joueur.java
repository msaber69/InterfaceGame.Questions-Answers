package com.company;

public class Joueur {
    private int numero;
    private String nom;
    private int score;
    private String etat;

    public Joueur(int numero, String nom, int score, String etat) {
        this.numero = numero;
        this.nom = nom;
        this.score = score;
        this.etat = etat;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void initialisationScore() {
        this.score=0;
    }
    public void majScore(int point){
        this.score+=point;
    }

    public void changementEtat(String nouvEtat){
        this.etat=nouvEtat;
    }



    @Override
    public String toString(){
        return "Le joueur " + this.nom + " a un score de : " + this.score + "\n";
    }
}
