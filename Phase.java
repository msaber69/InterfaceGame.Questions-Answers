package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Phase {
    default List<Joueur> deroulerPhaseJeu() {
        List<Joueur> joueurPhase2 = new ArrayList<Joueur>();
        return joueurPhase2 ;
    }

}
