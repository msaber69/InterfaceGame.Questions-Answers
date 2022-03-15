package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Phase3 implements Phase{
    private List<Joueur> JoueursSelectionnes;
    private List<TypeQuestionQCM> qcm;
    private List<TypeQuestionVF> vf;
    private List<TypeQuestionRC> rc;
    private List<String> theme;
    public Phase3(List<Joueur> JoueursSelectionnes, List<TypeQuestionQCM> qcm, List<TypeQuestionVF> vf, List<TypeQuestionRC> rc, List<String> theme){
        this.JoueursSelectionnes=JoueursSelectionnes;
        this.qcm=qcm;
        this.vf=vf;
        this.rc=rc;
        this.theme=theme;
    }

    @Override
    public List<Joueur> deroulerPhaseJeu() {

        System.out.println("Bienvenue dans la phase Finale : la phase 3. \nChaque joueur aura 3 questions. \nA l'issue de cette phase seul le meilleur joueur sera le grand GAGNANT du jeu. \nPar contre, s'il y a une égalité les deux joueurs, ils seront départagés par un système de repêchage comme aux phases précédentes. \nLe jeu va commencer.");

        int rangQuestion;
        String themePourJoueur;
        String themeQ;
        String reponseJoueur;

        System.out.println("Dans cette phase, le niveau est difficile pour toutes les questions qui suivent.");


        //Execution des questions comme à la phase 1 et 2
        for(int i=0; i<2; i++){

            //Scanner scca = new Scanner(System.in);
            //themePourJoueur=scca.nextLine();
            //while((!themePourJoueur.equals("manga")) || (!themePourJoueur.equals("animal")) || (!themePourJoueur.equals("sport")) || (!themePourJoueur.equals("cultureG")) || (!themePourJoueur.equals("voiture")) || (!themePourJoueur.equals("rap")) ||(!themePourJoueur.equals("serie")) || (!themePourJoueur.equals("film")) || (!themePourJoueur.equals("histoire")) ||(!themePourJoueur.equals("francais"))){
            System.out.println(JoueursSelectionnes.get(i).getNom()+" , c'est à vous de jouer.");
            themePourJoueur="histoire";

            System.out.println("Le thème imposé pour la question de type QCM est : "+themePourJoueur);
            Random rand3 = new Random();
            rangQuestion= rand3.nextInt(qcm.size());
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
            //while(!(themeQ.equals(themePourJoueur))  && 2!=qcm.get(rangQuestion).getClQuestion().getDifficulte()){

            String questionEnRapportAvecLeThemeChoisi ="refaire";
            while(questionEnRapportAvecLeThemeChoisi.equals("refaire")){
                Random rd = new Random();
                rangQuestion=rd.nextInt(qcm.size());
                themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 3==qcm.get(rangQuestion).getClQuestion().getDifficulte()){
                    questionEnRapportAvecLeThemeChoisi="sortir du while";
                }
            }
            System.out.println("QCM");
            System.out.println(qcm.get(rangQuestion).getClQuestion().getQuest());
            System.out.println(qcm.get(rangQuestion).getChoix1());
            System.out.println(qcm.get(rangQuestion).getChoix2());
            System.out.println(qcm.get(rangQuestion).getChoix3());
            System.out.println("Donner votre réponse");
            Scanner scan = new Scanner(System.in);
            reponseJoueur=scan.nextLine();
            System.out.println("La réponse était : "+qcm.get(rangQuestion).getClQuestion().getReponse());
            if(reponseJoueur.equals(qcm.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(5);
                System.out.println("Bravo vous avez gagné 5 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            qcm.remove(rangQuestion);

            themePourJoueur="cultureG";
            System.out.println("Le thème imposé pour la question de type RC est : "+themePourJoueur);

            Random rando4 = new Random();
            rangQuestion= rando4.nextInt(rc.size());
            themeQ= rc.get(rangQuestion).getClQuestion().getTheme();
            String questionEnRapportAvecLeThemeChoisiA ="refaire";
            while(questionEnRapportAvecLeThemeChoisiA.equals("refaire")){
                Random rdA = new Random();
                rangQuestion=rdA.nextInt(rc.size());
                themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 3==rc.get(rangQuestion).getClQuestion().getDifficulte()){
                    questionEnRapportAvecLeThemeChoisiA="sortir du while";
                }
            }
            /*
            while(themeQ != themePourJoueur && 2!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
                Random radstt = new Random();
                rangQuestion=radstt.nextInt(rc.size());
                themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
            }

             */
            System.out.println("RC");
            System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scann = new Scanner(System.in);
            reponseJoueur=scann.nextLine();
            System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
            if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(5);
                System.out.println("Bravo vous avez gagné 5 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            rc.remove(rangQuestion);


            themePourJoueur="serie";
            System.out.println("Le thème imposé pour la question de type VF est : "+themePourJoueur);

            Random rdest = new Random();
            rangQuestion= rdest.nextInt(vf.size());
            themeQ= vf.get(rangQuestion).getClQuestion().getTheme();

            String questionEnRapportAvecLeThemeChoisiAB ="refaire";
            while(questionEnRapportAvecLeThemeChoisiAB.equals("refaire")){
                Random rdAB = new Random();
                rangQuestion=rdAB.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 3==vf.get(rangQuestion).getClQuestion().getDifficulte()){
                    questionEnRapportAvecLeThemeChoisiAB="sortir du while";
                }
            }
            /*
            while(themeQ != themePourJoueur && 2!=vf.get(rangQuestion).getClQuestion().getDifficulte()){
                Random radium = new Random();
                rangQuestion=radium.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
            }

             */
            System.out.println("VF");
            System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scanner1 = new Scanner(System.in);
            reponseJoueur=scanner1.nextLine();
            if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(5);
                System.out.println("Bravo vous avez gagné 5 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            vf.remove(rangQuestion);


            System.out.println("Le score final en phase 2 de "+JoueursSelectionnes.get(i).getNom()+" est de "+JoueursSelectionnes.get(i).getScore()+ "point(s).");


        }






        //Étude des cas d'égalité


        List<Joueur> phaseGagnant = new ArrayList<Joueur>();


        //Joueur 1 perdant
        if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phaseGagnant.add(JoueursSelectionnes.get(1));
            System.out.println("Le GRAND GAGNANT EST : "+JoueursSelectionnes.get(1).getNom() );
            System.out.println("FÉLICITATION");
            return phaseGagnant;
        }

        //Joueur 2 perdant
        if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phaseGagnant.add(JoueursSelectionnes.get(0));
            System.out.println("Le GRAND GAGNANT EST : "+JoueursSelectionnes.get(0).getNom() );
            System.out.println("FÉLICITATION");
            return phaseGagnant;
        }






        //Égalité entre les 2 joueurs
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore()){
            System.out.println("Cette partie du jeu est un repêchage (existence d'une égalité) pour déterminer le GRAND gagnant");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore())) {
            String execution="refaire";

            //Question de type VF tant que l'on a pas a perdant
            while(execution.equals("refaire")){
                for (int k=0; k<2;k++) {
                    Random rde1 = new Random();
                    rangQuestion = rde1.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour  " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donnez votre réponse");
                    Scanner lec = new Scanner(System.in);
                    reponseJoueur = lec.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                    else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }



            }
            //Joueur 2 grand gagnant
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phaseGagnant.add(JoueursSelectionnes.get(1));
                System.out.println("Le GRAND GAGNANT EST : "+JoueursSelectionnes.get(1).getNom());
                System.out.println("FÉLICITATION");
                return phaseGagnant;
            }
            //joueur 1 grand gagnat
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phaseGagnant.add(JoueursSelectionnes.get(0));
                System.out.println("Le GRAND GAGNANT EST : "+JoueursSelectionnes.get(0).getNom());
                System.out.println("FÉLICITATION");
                return phaseGagnant;
            }

        }







        return Phase.super.deroulerPhaseJeu();
    }
}
