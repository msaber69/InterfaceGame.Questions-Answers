package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Phase1 implements Phase {
    private List<Joueur> JoueursSelectionnes;
    private List<TypeQuestionQCM> qcm;
    private List<TypeQuestionVF> vf;
    private List<TypeQuestionRC> rc;
    private List<String> theme;
    public Phase1(List<Joueur> JoueursSelectionnes, List<TypeQuestionQCM> qcm, List<TypeQuestionVF> vf, List<TypeQuestionRC> rc, List<String> theme){
        this.JoueursSelectionnes=JoueursSelectionnes;
        this.qcm=qcm;
        this.vf=vf;
        this.rc=rc;
        this.theme=theme;
    }

    @Override
    public List<Joueur> deroulerPhaseJeu() {
        /*System.out.println("Soyez les bienvenus dans Questions pour un Champion !");
        System.out.println("Combien de personnes souhaitent jouer ?");
        int nbJoueur;
        int num=100;
        String etatjoueur="Non selectionné";
        int score =0;
        List<Joueur> tableauJoueursInitiaux = new ArrayList<Joueur>();
        Scanner scanner = new Scanner(System.in);
        nbJoueur=scanner.nextInt();
        while(nbJoueur < 4 || nbJoueur > 20){
            System.err.println("Il faut au minimum 4 joueurs et au maximum de 20 joueurs");
            System.out.println("Combien de personnes souhaitent jouer ? (nombre compris entre 4 et 20)");
            nbJoueur=scanner.nextInt();
        }
        for(int i=0; i<nbJoueur;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Donnez un nom à votre avatar joueur "+(i+1));
            String nom = scan.nextLine();
            Joueur j = new Joueur(num,nom,score,etatjoueur);
            tableauJoueursInitiaux.add(j);
            num+=10;
        }
        System.out.println("Merci d'avoir remplis les champs demandés");
        Joueurs game =new Joueurs(tableauJoueursInitiaux);
        System.out.println("Voici les joueurs sélectionnés pour la phase 1 :");
        System.out.println(game.selectionAleatoire(nbJoueur));
        List<Joueur> JoueursSelectionnes = game.getTableauJoueursSelectionnés();

         */

        System.out.println("Chaque joueur aura 3 questions. \nA l'issue de cette phase 1 seuls les trois meilleurs joueurs seront selectionnés. \nPar contre, si il y a une égalité les joueurs seront départagés par un système de repêchage et les meilleurs participeront à la phase 2. \nLe jeu va commencer.");

        int rangQuestion;
        String themePourJoueur;
        String themeQ;
        String reponseJoueur;
        int i =0;
        /*
        for(i=0; i<4; i++){
            themePourJoueur= this.theme.get(i);
            System.out.println(JoueursSelectionnes.get(i).getNom()+" c'est à votre tour de jouer");
            System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
            Random rand3 = new Random();
            rangQuestion= rand3.nextInt(qcm.size());
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
            while(themeQ != themePourJoueur){
                Random rd = new Random();
                rangQuestion=rd.nextInt(qcm.size());
                themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
            }
            System.out.println(qcm.get(rangQuestion).getClQuestion().getQuest());
            System.out.println(qcm.get(rangQuestion).getChoix1());
            System.out.println(qcm.get(rangQuestion).getChoix2());
            System.out.println(qcm.get(rangQuestion).getChoix3());
            System.out.println("Donner votre réponse");
            Scanner scan = new Scanner(System.in);
            reponseJoueur=scan.nextLine();
            if(reponseJoueur.equals(qcm.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(2);
                System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            qcm.remove(rangQuestion);


            Random rando4 = new Random();
            rangQuestion= rando4.nextInt(rc.size());
            themeQ= rc.get(rangQuestion).getClQuestion().getTheme();
            while(themeQ != themePourJoueur || 1!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
                Random rad = new Random();
                rangQuestion=rad.nextInt(rc.size());
                themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
            }
            System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scann = new Scanner(System.in);
            reponseJoueur=scann.nextLine();
            if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(2);
                System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            rc.remove(rangQuestion);


            Random rde = new Random();
            rangQuestion= rde.nextInt(vf.size());
            themeQ= vf.get(rangQuestion).getClQuestion().getTheme();
            while(themeQ != themePourJoueur){
                Random rad = new Random();
                rangQuestion=rad.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
            }
            System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
            System.out.println("Donner votre réponse");
            Scanner scanner1 = new Scanner(System.in);
            reponseJoueur=scanner1.nextLine();
            if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
                JoueursSelectionnes.get(i).majScore(2);
                System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            else{
                System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
            }
            vf.remove(rangQuestion);


        }

         */


        int tailleqcm= qcm.size();
        int taillevf=vf.size();
        int taillerc=rc.size();


        //Question 1 joueur 1
        themePourJoueur= this.theme.get(i);
        System.out.println(JoueursSelectionnes.get(i).getNom()+" c'est à votre tour de jouer");
        System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
        Random rand3 = new Random();
        rangQuestion= rand3.nextInt(tailleqcm-i);
        themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard

        while(themeQ != themePourJoueur){
            Random rd = new Random();
            rangQuestion=rd.nextInt(tailleqcm-i);
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
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
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        qcm.remove(rangQuestion);


        //Question 2 joueur 1

        Random rando4 = new Random();
        rangQuestion= rando4.nextInt(taillerc-i);
        themeQ= rc.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard et ayant comme une difficulté facile (1)

        while(themeQ != themePourJoueur && 1!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillerc-i);
            themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("RC");
        System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner scann = new Scanner(System.in);
        reponseJoueur=scann.nextLine();
        System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        rc.remove(rangQuestion);

        //Question 3 joueur 1


        Random rde = new Random();
        rangQuestion= rde.nextInt(taillevf-i);
        themeQ= vf.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard

        while(themeQ != themePourJoueur){
            Random radis = new Random();
            rangQuestion=radis.nextInt(taillevf-i);
            themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("VF");
        System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner scanner1 = new Scanner(System.in);
        reponseJoueur=scanner1.nextLine();
        System.out.println("La réponse était : "+vf.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        vf.remove(rangQuestion);



        i=1;
        themePourJoueur= this.theme.get(i);
        System.out.println(JoueursSelectionnes.get(i).getNom()+" c'est à votre tour de jouer");
        System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
        Random hasa1 = new Random();
        rangQuestion= hasa1.nextInt(tailleqcm-i);
        themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard

        while(themeQ != themePourJoueur){
            Random rdi = new Random();
            rangQuestion=rdi.nextInt(tailleqcm-i);
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
        }

        //Question 1 joueur 2

        System.out.println("QCM");
        System.out.println(qcm.get(rangQuestion).getClQuestion().getQuest());
        System.out.println(qcm.get(rangQuestion).getChoix1());
        System.out.println(qcm.get(rangQuestion).getChoix2());
        System.out.println(qcm.get(rangQuestion).getChoix3());
        System.out.println("Donner votre réponse");
        Scanner lecta1 = new Scanner(System.in);
        reponseJoueur=lecta1.nextLine();
        System.out.println("La réponse était : "+qcm.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(qcm.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        qcm.remove(rangQuestion);


        //Question 2 joueur 2

        Random hasaaq= new Random();
        rangQuestion= hasaaq.nextInt(taillerc);
        themeQ= rc.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard et ayant comme une difficulté facile (1)

        while(themeQ != themePourJoueur && 1!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillerc-i);
            themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("RC");
        System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lecta2 = new Scanner(System.in);
        reponseJoueur=lecta2.nextLine();
        System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        rc.remove(rangQuestion);


        //Question 3 joueur 2

        Random hasa3 = new Random();
        rangQuestion= hasa3.nextInt(taillevf-i);
        themeQ= vf.get(rangQuestion).getClQuestion().getTheme();

        //recheche de question ayant pour thème le thème choisi au hasard


        while(themeQ != themePourJoueur){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillevf-i);
            themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("VF");
        System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lecta3 = new Scanner(System.in);
        reponseJoueur=lecta3.nextLine();
        System.out.println("La réponse était : "+vf.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        vf.remove(rangQuestion);




        //Joueur 3 (idem Joueur 1 et Joueur 2)

        i=2;

        themePourJoueur= this.theme.get(i);
        System.out.println(JoueursSelectionnes.get(i).getNom()+" c'est à votre tour de jouer");
        System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
        Random hasb1 = new Random();
        rangQuestion= hasb1.nextInt(tailleqcm-i);
        themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur){
            Random rd = new Random();
            rangQuestion=rd.nextInt(tailleqcm-i);
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("QCM");
        System.out.println(qcm.get(rangQuestion).getClQuestion().getQuest());
        System.out.println(qcm.get(rangQuestion).getChoix1());
        System.out.println(qcm.get(rangQuestion).getChoix2());
        System.out.println(qcm.get(rangQuestion).getChoix3());
        System.out.println("Donner votre réponse");
        Scanner lectb1 = new Scanner(System.in);
        reponseJoueur=lectb1.nextLine();
        System.out.println("La réponse était : "+qcm.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(qcm.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        qcm.remove(rangQuestion);


        Random hasb2 = new Random();
        rangQuestion= hasb2.nextInt(taillerc-i);
        themeQ= rc.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur &&  1!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillerc-i);
            themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("RC");
        System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lectb2 = new Scanner(System.in);
        reponseJoueur=lectb2.nextLine();
        System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        rc.remove(rangQuestion);


        Random hasb3 = new Random();
        rangQuestion= hasb3.nextInt(taillevf-i);
        themeQ= vf.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillevf-i);
            themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("VF");
        System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lectb3 = new Scanner(System.in);
        reponseJoueur=lectb3.nextLine();
        System.out.println("La réponse était : "+vf.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        vf.remove(rangQuestion);








        //Joueur 4 (idem Joueur 1, 2 et 3)

        i=3;

        themePourJoueur= this.theme.get(i);
        System.out.println(JoueursSelectionnes.get(i).getNom()+" c'est à votre tour de jouer");
        System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
        Random hasc1 = new Random();
        rangQuestion= hasc1.nextInt(tailleqcm-i);
        themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur){
            Random rd = new Random();
            rangQuestion=rd.nextInt(tailleqcm-i);
            themeQ = qcm.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("QCM");
        System.out.println(qcm.get(rangQuestion).getClQuestion().getQuest());
        System.out.println(qcm.get(rangQuestion).getChoix1());
        System.out.println(qcm.get(rangQuestion).getChoix2());
        System.out.println(qcm.get(rangQuestion).getChoix3());
        System.out.println("Donner votre réponse");
        Scanner lectc1 = new Scanner(System.in);
        reponseJoueur=lectc1.nextLine();
        System.out.println("La réponse était : "+qcm.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(qcm.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        qcm.remove(rangQuestion);


        Random hasc2 = new Random();
        rangQuestion= hasc2.nextInt(taillerc-i);
        themeQ= rc.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur && 1!=rc.get(rangQuestion).getClQuestion().getDifficulte()){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillerc-i);
            themeQ = rc.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("RC");
        System.out.println(rc.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lectc2 = new Scanner(System.in);
        reponseJoueur=lectc2.nextLine();
        System.out.println("La réponse était : "+rc.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(rc.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        rc.remove(rangQuestion);


        Random hasc3 = new Random();
        rangQuestion= hasc3.nextInt(taillevf-i);
        themeQ= vf.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur){
            Random rad = new Random();
            rangQuestion=rad.nextInt(taillevf-i);
            themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println("VF");
        System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner lectc3 = new Scanner(System.in);
        reponseJoueur=lectc3.nextLine();
        System.out.println("La réponse était : "+vf.get(rangQuestion).getClQuestion().getReponse());
        if(reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        vf.remove(rangQuestion);



























        //Recherche d'égalité entre les joueurs






        List<Joueur> phase2Joueur = new ArrayList<Joueur>();



        //Si le 1er joueur à la moins de points alors il est éliminé
        if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
            return phase2Joueur;
        }

        //Si le 2e joueur à la moins de points alors il est éliminé
        if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
            return phase2Joueur;
        }
        //Si le 3e joueur à la moins de points alors il est éliminé
        if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
            return phase2Joueur;
        }
        //Si le 4e joueur à la moins de points alors il est éliminé
        if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom());
            return phase2Joueur;
        }

        //Si il y a une égalité entre tout les joueurs, on posera autant de questions de type QCM possible jusqu'à avoir un joueur qui a moins de points que les autres
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(3).getScore()) {
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            System.out.print("Tous les joueurs ont un score égale. Ce repêchage va permettre de vous départager avec des questions vrai ou faux");
            String execution = "refaire";
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore())) {
            //boucle while qui permet de départager les joueurs. On sortira de la boucle uniquement si il existe un joueur avec moins de points qe les autres.
            while (execution.equals("refaire")){
                for (int k = 0; k < 4; k++) {
                    Random rde1 = new Random();
                    rangQuestion = rde1.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donner votre réponse");
                    Scanner lec = new Scanner(System.in);
                    reponseJoueur = lec.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }
                if (JoueursSelectionnes.get(0).getScore() < JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore() < JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore() < JoueursSelectionnes.get(3).getScore()) {
                    execution = "sortir de la boucle while";
                }
                if (JoueursSelectionnes.get(1).getScore() < JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore() < JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore() < JoueursSelectionnes.get(3).getScore()) {
                    execution = "sortir de la boucle while";
                }
                if (JoueursSelectionnes.get(2).getScore() < JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore() < JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore() < JoueursSelectionnes.get(3).getScore()) {
                    execution = "sortir de la boucle while";
                }
                if (JoueursSelectionnes.get(3).getScore() < JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore() < JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore() < JoueursSelectionnes.get(0).getScore()) {
                execution = "sortir de la boucle while";
                }
            }

            //Si le 1er joueur à la moins de points alors il est éliminé
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Si le 2e joueur à la moins de points alors il est éliminé
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Si le 3e joueur à la moins de points alors il est éliminé

            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Si le 4e joueur à la moins de points alors il est éliminé

            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom());
                return phase2Joueur;
            }
        }
        //cas d'égalité entre les joueurs 1, 2 et 3
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(2).getScore() ){
            // selection du joueur 3 qui a le plus de points
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() ) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() ) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() ) ) {
            String execution="refaire";
            while(execution.equals("refaire")){
                for (int k=0; k<3;k++) {
                    Random rde2 = new Random();
                    rangQuestion = rde2.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour" + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donner votre réponse");
                    Scanner lec = new Scanner(System.in);
                    reponseJoueur = lec.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }

            }
            //Le joueur 1 est éliminé
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Le joueur 2 est éliminé

            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Le joueur 3 est éliminé

            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }

        }


        //cas d'égalité entre les joueurs 1,2 et 4
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(3).getScore() ){
            //Selection du joueur 3
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() &&  JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()) || (JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() &&  JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()) ) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k=0;
                Random rde2 = new Random();
                rangQuestion = rde2.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner lec = new Scanner(System.in);
                reponseJoueur = lec.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                k=1;
                Random rde2a = new Random();
                rangQuestion = rde2a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner scanner1a = new Scanner(System.in);
                reponseJoueur = scanner1a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                k=3;
                Random rde2b = new Random();
                rangQuestion = rde2b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner scanner1b = new Scanner(System.in);
                reponseJoueur = scanner1b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }

            }
            //Joueur 1 éliminé
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Joueur 2 éliminé
            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            //Joueur 4 éliminé
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(1).getNom());
                return phase2Joueur;
            }

        }

        //cas d'égalité entre les joueurs 1, 3 et 4
        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(3).getScore() ){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore())  || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k=0;
                Random rde3a = new Random();
                rangQuestion = rde3a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donnez votre réponse");
                Scanner scanner3a = new Scanner(System.in);
                reponseJoueur = scanner3a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                for (k=2; k<4;k++) {
                    Random rde3 = new Random();
                    rangQuestion = rde3.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donnez votre réponse");
                    Scanner scanner3 = new Scanner(System.in);
                    reponseJoueur = scanner3.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }

                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }



            }
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom());
                return phase2Joueur;
            }

        }
        //cas d'égalité entre les joueurs 2, 3 et 4
        if(JoueursSelectionnes.get(3).getScore()==JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()==JoueursSelectionnes.get(2).getScore() ){
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            //while (!(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                for (int k=1; k<4;k++) {
                    Random rde4 = new Random();
                    rangQuestion = rde4.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donner votre réponse");
                    Scanner scanner4 = new Scanner(System.in);
                    reponseJoueur = scanner4.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }

                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }


            }

            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore() && JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore() && JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom());
                return phase2Joueur;
            }
        }

        // 2 egalites

        //cas d'égalité entre les joueurs 3 et 4

        if(JoueursSelectionnes.get(3).getScore()==JoueursSelectionnes.get(2).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            //while (!(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                for (int k=2; k<4;k++) {
                    Random rde01 = new Random();
                    rangQuestion = rde01.nextInt(vf.size());
                    themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                    System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                    System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                    System.out.println("Donner votre réponse");
                    Scanner scanner01 = new Scanner(System.in);
                    reponseJoueur = scanner01.nextLine();
                    if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                        JoueursSelectionnes.get(k).majScore(1);
                        System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    } else {
                        System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                    }
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }



            }

            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;            }
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom());
                return phase2Joueur;              }
        }

        //cas d'égalité entre les joueurs 2 et 4

        if(JoueursSelectionnes.get(3).getScore()==JoueursSelectionnes.get(1).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k=1;
                Random rde02a = new Random();
                rangQuestion = rde02a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner02a = new Scanner(System.in);
                reponseJoueur = scanner02a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k=3;
                Random rde02b = new Random();
                rangQuestion = rde02b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner02b = new Scanner(System.in);
                reponseJoueur = scanner02b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }


                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore()){
                    execution = "sortir de la boucle while";
                }



            }

            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom());
                return phase2Joueur;
            }
        }

        //cas d'égalité entre les joueurs 3 et 2

        if(JoueursSelectionnes.get(2).getScore()==JoueursSelectionnes.get(1).getScore()){
            JoueursSelectionnes.get(0).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(0));
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k = 0;
                Random rde03a = new Random();
                rangQuestion = rde03a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner03a = new Scanner(System.in);
                reponseJoueur = scanner03a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k = 3;
                Random rde03b = new Random();
                rangQuestion = rde03b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner03b = new Scanner(System.in);
                reponseJoueur = scanner03b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore()){
                    execution = "sortir de la boucle while";
                }


            }

            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
        }

        //cas d'égalité entre les joueurs 1 et 4

        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(3).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()) || !(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k = 1;
                Random rde04a = new Random();
                rangQuestion = rde04a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner04a = new Scanner(System.in);
                reponseJoueur = scanner04a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k = 2;
                Random rde04b = new Random();
                rangQuestion = rde04b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner04b = new Scanner(System.in);
                reponseJoueur = scanner04b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }


            }

            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(3).getScore()){
                JoueursSelectionnes.get(3).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(3));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(3).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(2).getNom());
                return phase2Joueur;
            }
        }

        //cas d'égalité entre les joueurs 1 et 3


        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(2).getScore()){
            JoueursSelectionnes.get(1).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(1));
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()) || !(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k = 0;
                Random rde05a = new Random();
                rangQuestion = rde05a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner05a = new Scanner(System.in);
                reponseJoueur = scanner05a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k = 2;
                Random rde05b = new Random();
                rangQuestion = rde05b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner05b = new Scanner(System.in);
                reponseJoueur = scanner05b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }


            }

            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(2).getScore()){
                JoueursSelectionnes.get(2).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(2));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(2).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
        }

        //cas d'égalité entre les joueurs 1 et 2

        if(JoueursSelectionnes.get(0).getScore()==JoueursSelectionnes.get(1).getScore()){
            JoueursSelectionnes.get(3).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(3));
            JoueursSelectionnes.get(2).setScore(0);
            phase2Joueur.add(JoueursSelectionnes.get(2));
            System.out.println("Cette partie du jeu est un repêchage des joueurs ayant une égalité");
            int k;
            //while (!(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()) || !(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore())) {
            String execution="refaire";
            while(execution.equals("refaire")){
                k = 0;
                Random rde06a = new Random();
                rangQuestion = rde06a.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner06a = new Scanner(System.in);
                reponseJoueur = scanner06a.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }

                k = 1;
                Random rde06b = new Random();
                rangQuestion = rde06b.nextInt(vf.size());
                themeQ = vf.get(rangQuestion).getClQuestion().getTheme();
                System.out.println("C'est à votre tour " + JoueursSelectionnes.get(k).getNom());
                System.out.println(vf.get(rangQuestion).getClQuestion().getQuest());
                System.out.println("Donner votre réponse");
                Scanner scanner06b = new Scanner(System.in);
                reponseJoueur = scanner06b.nextLine();
                if (reponseJoueur.equals(vf.get(rangQuestion).getClQuestion().getReponse())) {
                    JoueursSelectionnes.get(k).majScore(1);
                    System.out.println("Bravo vous avez gagné 1 point BONUS. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                } else {
                    System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : " + JoueursSelectionnes.get(k).getScore());
                }
                if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                    execution = "sortir de la boucle while";
                }
                if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
                    execution = "sortir de la boucle while";
                }

            }

            if(JoueursSelectionnes.get(1).getScore()<JoueursSelectionnes.get(0).getScore()){
                JoueursSelectionnes.get(0).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(0));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(0).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
            if(JoueursSelectionnes.get(0).getScore()<JoueursSelectionnes.get(1).getScore()){
                JoueursSelectionnes.get(1).setScore(0);
                phase2Joueur.add(JoueursSelectionnes.get(1));
                System.out.println("Les joueurs selectionnés sont : "+ JoueursSelectionnes.get(1).getNom()+" , "+JoueursSelectionnes.get(2).getNom()+" , "+JoueursSelectionnes.get(3).getNom());
                return phase2Joueur;
            }
        }

        //les éléments suivant ne seront jamais exploités par le compilateur

        System.out.println("Les joueurs sélectionnés pour la phase 2 sont : ");
        System.out.println(phase2Joueur.get(0).getNom());
        System.out.println(phase2Joueur.get(1).getNom());
        System.out.println(phase2Joueur.get(2).getNom());






        return phase2Joueur;
    }
}
