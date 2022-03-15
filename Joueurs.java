package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joueurs {
    private int nombreJoueurs;
    private List<Joueur> tableauJoueursInitiaux;
    private List<Joueur> tableauJoueursSelectionnés;
    public Joueurs(List<Joueur> tableauJoueursInitiaux){
        this.tableauJoueursInitiaux=tableauJoueursInitiaux;
    }

    public List<Joueur> getTableauJoueursSelectionnés() {
        return tableauJoueursSelectionnés;
    }
    public void setTableauJoueursSelectionnés(List<Joueur> tableauJoueursSelectionnés) {
        this.tableauJoueursSelectionnés = tableauJoueursSelectionnés;
    }

    public List<Joueur> selectionAleatoire(int njoueur){
        this.tableauJoueursSelectionnés=new ArrayList<Joueur>();
        Random random = new Random();
        int numJoueur1=random.nextInt(njoueur);
        tableauJoueursInitiaux.get(numJoueur1).setEtat("Selectionné");
        this.tableauJoueursSelectionnés.add(tableauJoueursInitiaux.get(numJoueur1));
        int numJoueur2=random.nextInt(njoueur);
        while (numJoueur1==numJoueur2){
            numJoueur2=random.nextInt(njoueur);
        }
        tableauJoueursInitiaux.get(numJoueur2).setEtat("Selectionné");
        this.tableauJoueursSelectionnés.add(tableauJoueursInitiaux.get(numJoueur2));
        int numJoueur3=random.nextInt(njoueur);
        while (numJoueur2==numJoueur3 || numJoueur3==numJoueur1){
            numJoueur3=random.nextInt(njoueur);
        }
        tableauJoueursInitiaux.get(numJoueur3).setEtat("Selectionné");
        this.tableauJoueursSelectionnés.add(tableauJoueursInitiaux.get(numJoueur3));
        int numJoueur4=random.nextInt(njoueur);
        while (numJoueur4==numJoueur3 || numJoueur4==numJoueur2 || numJoueur4==numJoueur1){
            numJoueur4=random.nextInt(njoueur);
        }
        tableauJoueursInitiaux.get(numJoueur4).setEtat("Selectionné");
        this.tableauJoueursSelectionnés.add(tableauJoueursInitiaux.get(numJoueur4));

        return this.tableauJoueursSelectionnés;

    }

    public String toString(){
        return "Voici les participants : " + this.tableauJoueursSelectionnés.get(0).getNom() + " , " + this.tableauJoueursSelectionnés.get(1).getNom() + " , " + this.tableauJoueursSelectionnés.get(2).getNom() + " , " + this.tableauJoueursSelectionnés.get(3).getNom();
    }
}
