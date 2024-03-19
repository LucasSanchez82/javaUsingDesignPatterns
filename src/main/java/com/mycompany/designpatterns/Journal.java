package com.mycompany.designpatterns;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Journal {

    private ArrayList<Evenement> evenements;
    private static Journal uniqueInstance;

    public Journal() {
        this.evenements = new ArrayList<>();
    }

    @Override
    public String toString() {
        String string = "Journal{";
        for (Evenement evenement : evenements) {
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

    public void downloadFile(String typeOfFile) {
        switch (typeOfFile) {
            case "excel":
                this.writeUsingOutputStream(this.toString());
                break;
            default:
                this.writeUsingOutputStream(this.toString());
                break;
        }
    }

    private void writeUsingOutputStream(String data) {
        PrintWriter writer;
        try {
            writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("\n" + new Date() );
            writer.println(data);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Journal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Journal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
