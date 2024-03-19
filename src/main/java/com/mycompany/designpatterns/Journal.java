package com.mycompany.designpatterns;

import java.util.ArrayList;
import java.util.Date;

public class Journal {
    private ArrayList<Evenement> evenements;
    private static Journal uniqueInstance;

    public Journal() {
        this.evenements = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String string = "Journal{";
        for(Evenement evenement : evenements) {
            string = string + "\n\t" + evenement;
        }
        return string + "\n}";
    }

    public void addEvenement(String evenement) {
        this.evenements.add(new Evenement(evenement, new Date()));
    }

    public static Journal getInstance() {
        if (Journal.uniqueInstance == null) {
            Journal.uniqueInstance = new Journal();
        }
        return Journal.uniqueInstance;
    }

}
