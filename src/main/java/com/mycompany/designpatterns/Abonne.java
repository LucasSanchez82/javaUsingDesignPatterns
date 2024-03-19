package com.mycompany.designpatterns;

public class Abonne implements AbonneInterface{
    private String nom;
    private Journal journal;
    public Abonne(String nom) {
        this.nom = nom;
        this.journal = Journal.getInstance();
        journal.addEvenement("nouvel abonne : " + nom);
    }

    @Override
    public String toString() {
        return String.format("(%s)", this.nom);
    }

    @Override
    public void recoitAlerte(String message) {
        System.out.println(this + " -> " + message);
        this.journal.addEvenement(message);
    }
}
