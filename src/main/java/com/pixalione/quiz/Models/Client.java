package com.pixalione.quiz.Models;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class Client {
    private String CIN;
    private String nom;
    private String prenom;
    private String telephone;



    @Override
    public String toString() {
        return "Client{" +
                "CIN='" + CIN + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
