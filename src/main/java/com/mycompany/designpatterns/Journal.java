package com.mycompany.designpatterns;

import java.util.ArrayList;

public class Journal {

    private ArrayList<String> evenements;
    private static Journal uniqueInstance;

    public Journal() {
        this.evenements = new ArrayList<>();
    }

    public void addEvenement(String evenement) {
        this.evenements.add(evenement);
    }

    public static Journal getInstance() {
        if (Journal.uniqueInstance == null) {
            Journal.uniqueInstance = new Journal();
        }
        return Journal.uniqueInstance;
    }

}
