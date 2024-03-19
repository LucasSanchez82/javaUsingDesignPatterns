/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns;

import java.util.Date;

/**
 *
 * @author l.sanchez
 */
public class Evenement {
    String message;
    Date date;
    
    public Evenement(String message, Date date) {
        this.message = message; 
        this.date = date;
    }

    @Override
    public String toString() {
        return "Evenement{ \n\t\t" + message + ", \n\t\tdate=" + date + "\n}";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
