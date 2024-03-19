package com.mycompany.designpatterns;

import java.util.ArrayList;

public class GestionAlertes {
    private ArrayList<AbonneInterface> abonnes = new ArrayList<>();
    
    public void addAbonne(AbonneInterface abonne) {
        this.abonnes.add(abonne);
    }
    
    public void envoiAlerte(String message) {
        System.out.println("mon message d'alerte : " + message);
        for(int i = 0; i < abonnes.size(); i++) {
            AbonneInterface abonne = abonnes.get(i);
            abonne.recoitAlerte(message);
        }
    }
}
