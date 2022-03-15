package com.company;

import java.util.List;
import java.util.Scanner;

public class Themes {
    private String theme;
    private List<String> listeTheme;
    public Themes(String theme){
        this.theme=theme;
    }

    public void choixTheme(int rang){
        if(rang<1 || rang>this.listeTheme.size()){
            System.err.println("Donner un nombre compris entre 1 et "+this.listeTheme.size());
            System.out.println("Indiquer le rang du thème choisi");
            Scanner scanner =new Scanner(System.in);
            rang=scanner.nextInt();
        }
        System.out.println("Vous avez choisi le thème : " + this.listeTheme.get((rang-1)) );
    }

    public void afficherTheme(){
        for(int i=0 ; i<this.listeTheme.size() ; i++){
            System.out.println("Le thème "+ (i+1) + " est : "+ this.listeTheme.get(i));
        }
    }


}
