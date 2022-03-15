package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Phase2 implements Phase{
    private List<Joueur> JoueursSelectionnes;
    private List<TypeQuestionQCM> qcm;
    private List<TypeQuestionVF> vf;
    private List<TypeQuestionRC> rc;
    private List<String> theme;
    public Phase2(List<Joueur> JoueursSelectionnes, List<TypeQuestionQCM> qcm, List<TypeQuestionVF> vf, List<TypeQuestionRC> rc, List<String> theme){
        this.JoueursSelectionnes=JoueursSelectionnes;
        this.qcm=qcm;
        this.vf=vf;
        this.rc=rc;
        this.theme=theme;
    }

    @Override
    public List<Joueur> deroulerPhaseJeu() {

        System.out.println("Chaque joueur aura 3 questions. \nA l'issue de cette phase 2 seuls les deux meilleurs joueurs seront selectionnés. \nPar contre, si il y a une égalité les joueurs seront départagés par un système de repêchage et les meilleurs participeront à la phase 3. \nLe jeu va commencer.");

        int rangQuestion;
        String themePourJoueur;
        String themeQ;
        String reponseJoueur;

        System.out.println("Dans cette phase, la difficulté est modérée");


        //3 joueurs donc boucle for allant de 0 à 2

        for(int i=0; i<3; i++){
            System.out.println("Les thèmes disponibles sont : " + theme);
            System.out.println(JoueursSelectionnes.get(i).getNom()+" , c'est à votre tour de jouer");
            System.out.println("Choisissez un thème");
            //Scanner scca = new Scanner(System.in);
            //themePourJoueur=scca.nextLine();
            //while((!themePourJoueur.equals("manga")) || (!themePourJoueur.equals("animal")) || (!themePourJoueur.equals("sport")) || (!themePourJoueur.equals("cultureG")) || (!themePourJoueur.equals("voiture")) || (!themePourJoueur.equals("rap")) ||(!themePourJoueur.equals("serie")) || (!themePourJoueur.equals("film")) || (!themePourJoueur.equals("histoire")) ||(!themePourJoueur.equals("francais"))){
            themePourJoueur="manga";
            String execution="refaire";

            //le joueur choisi son thème

            while(execution.equals("refaire")){
                System.out.println("Choisissez un thème.Ne faites pas de fautes d'orthographes.");
                Scanner sccaa = new Scanner(System.in);
                themePourJoueur=sccaa.nextLine();
                if(themePourJoueur.equals("manga")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("animal")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("sport")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("cultureG")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("voiture")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("rap")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("serie")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("film")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("histoire")){
                    execution="sortir du while";
                }
                if(themePourJoueur.equals("francais")){
                    execution="sortir du while";
                }

            }
            System.out.println("Vous avez choisi le thème : "+themePourJoueur);
            Random rand3 = new Random();
            rangQuestion= rand3.nextInt(qcm.size());
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
            //while(!(themeQ.equals(themePourJoueur))  && 2!=qcm.get(rangQuestion).getClQuestion().getDifficulte()){

            //recherche de questions ayant le theme choisi et ayant une difficulté modérée
            String questionEnRapportAvecLeThemeChoisi ="refaire";
            while(questionEnRapportAvecLeThemeChoisi.equals("refaire")){
                Random rd = new Random();
                rangQuestion=rd.nextInt(qcm.size());
                themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 2==qcm.get(rangQuestion).getClQuestion().getDifficulte()){
                    questionEnRapportAvecLeThemeChoisi="sortir du while";
                }
            }
            //Question de type QCM

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
                JoueursSelectionnes.get(i).majScore(3);
                System.out.println("Bravo vous avez gagné 3 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            qcm.remove(rangQuestion);


            Random rando4 = new Random();
            rangQuestion= rando4.nextInt(rc.size());
            themeQ= rc.get(rangQuestion).getClQuestion().getTheme();
            String questionEnRapportAvecLeThemeChoisiA ="refaire";
            //recherche de questions ayant le theme choisi et ayant une difficulté modérée
            while(questionEnRapportAvecLeThemeChoisiA.equals("refaire")){
                Random rdA = new Random();
                rangQuestion=rdA.nextInt(rc.size());
                themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 2==rc.get(rangQuestion).getClQuestion().getDifficulte()){
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
            //Question de type RC
            System.out.println("RC");
            System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scann = new Scanner(System.in);
            reponseJoueur=scann.nextLine();
            System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
            if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(3);
                System.out.println("Bravo vous avez gagné 3 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            rc.remove(rangQuestion);


            Random rdest = new Random();
            rangQuestion= rdest.nextInt(vf.size());
            themeQ= vf.get(rangQuestion).getClQuestion().getTheme();

            String questionEnRapportAvecLeThemeChoisiAB ="refaire";
            //recherche de questions ayant le theme choisi et ayant une difficulté modérée
            while(questionEnRapportAvecLeThemeChoisiAB.equals("refaire")){
                Random rdAB = new Random();
                rangQuestion=rdAB.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                if(themeQ.equals(themePourJoueur) && 2==vf.get(rangQuestion).getClQuestion().getDifficulte()){
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
            //Question de type VF
            System.out.println("VF");
            System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scanner1 = new Scanner(System.in);
            reponseJoueur=scanner1.nextLine();
            if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(3);
                System.out.println("Bravo vous avez gagné 3 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            vf.remove(rangQuestion);


            System.out.println("Le score final en phase 2 de "+JoueursSelectionnes.get(i).getNom()+" est de "+JoueursSelectionnes.get(i).getScore()+ " point(s).");


        }










        //recherche égalité

        List<Joueur> phase3Joueur = new ArrayList<Joueur>();


        //joueur 1 éliminé
        if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(2).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
            return phase3Joueur;
        }
        //joueur 2 éliminé
        if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() &&  JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(2).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(0).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
            return phase3Joueur;
        }
        //joueur 3 éliminé
        if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(0).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(0));
            System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(0).getNom() );
            return phase3Joueur;
        }


        //Égalité entre tous les joueurs
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(2).getScore()){
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore())) {
            String execution="refaire";
            // uestion de type VF on ne sort pas de la boucle while tant que l'on a pas un perdant
            while(execution.equals("refaire")){
                for (int k=0; k<3;k++) {
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
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() &&  JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }


                }
            //Joueur 1 éliminé
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(2).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }
            //Joueur 2 éliminé
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() &&  JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(2).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(0).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }
            //Joueur 3 éliminé
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(0).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(0).getNom() );
                return phase3Joueur;
            }

        }
        //cas d'égalité entre les joueurs 1 et 2
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore()){
            //joueur 3 directement selectionné
            JoueursSelectionnes.get(2).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() )){
            String execution="refaire";
            while(execution.equals("refaire")){
                for (int k=0; k<2;k++) {
                    Random rde7 = new Random();
                    rangQuestion = rde7.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour  " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donnez votre réponse");
                    Scanner lecx = new Scanner(System.in);
                    reponseJoueur = lecx.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
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
            //joueur 1 éliminé
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }
            //joueur 2 éliminé
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(0).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }


        }


        //Cas égalité entre les joueurs 2 et 3
        if(JoueursSelectionnes.get(2).getScore()==JoueursSelectionnes.get(1).getScore()){
            //Joueur 1 est sélectionné
            JoueursSelectionnes.get(0).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(0));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            //while (!(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() )){
            String execution="refaire";
            while(execution.equals("refaire")){
                for (int k=1; k<3;k++) {
                    Random rde7 = new Random();
                    rangQuestion = rde7.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour  " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donnez votre réponse");
                    Scanner lecx = new Scanner(System.in);
                    reponseJoueur = lecx.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }

                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }

            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(0).getNom() );
                return phase3Joueur;
            }
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(2).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(0).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }


        }



        //Cas égalité entre les joueurs 1 et 3
        if(JoueursSelectionnes.get(2).getScore()==JoueursSelectionnes.get(0).getScore()){
            //Joueur 2 est sélectionné
            JoueursSelectionnes.get(1).setScore(0);
            phase3Joueur.add(JoueursSelectionnes.get(1));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            //while (!(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()) || !(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() )){
            String execution="refaire";
            int k;
            while(execution.equals("refaire")){

                k=0;
                Random rde7 = new Random();
                rangQuestion = rde7.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour  " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner lecx = new Scanner(System.in);
                reponseJoueur = lecx.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k=2;
                Random rde71 = new Random();
                rangQuestion = rde71.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour  " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner lecxw = new Scanner(System.in);
                reponseJoueur = lecxw.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }

            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(0).getNom() );
                return phase3Joueur;
            }
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(2).setScore(0);
                phase3Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs sélectionnés pour la phase 3 sont : "+JoueursSelectionnes.get(1).getNom() +" , "+JoueursSelectionnes.get(2).getNom() );
                return phase3Joueur;
            }


        }
















        return Phase.super.deroulerPhaseJeu();
    }
}
