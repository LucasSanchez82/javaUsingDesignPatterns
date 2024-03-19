package com.mycompany.designpatterns;

import java.util.ArrayList;

public class GestionAlertes {

    private ArrayList<AbonneInterface> abonnes;
    private Journal journal;
    
    public GestionAlertes() {
        this.journal = Journal.getInstance();
        this.abonnes = new ArrayList<>();
    }

    public void addAbonne(AbonneInterface abonne) {
        this.abonnes.add(abonne);
        this.journal.addEvenement(abonne.toString());
    }

    public void envoiAlerte(String message) {
        this.journal.addEvenement(message);
        for (int i = 0; i < abonnes.size(); i++) {
            AbonneInterface abonne = abonnes.get(i);
            abonne.recoitAlerte(message);
        }
    }
}
