package com.mycompany.designpatterns;

public class Abonne implements AbonneInterface{
    private String nom;

    public Abonne(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("(%s)", this.nom);
    }

    @Override
    public void recoitAlerte(String message) {
        System.out.println(this + " -> " + message);
    }
}
