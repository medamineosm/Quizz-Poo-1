package com.pixalione.quiz.Models;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class Client {
    private String CIN;
    private String nom;
    private String prenom;
    private String telephone;

    public Client() {}

    public Client(String CIN, String nom, String prenom) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client(String CIN, String nom, String prenom, String telephone) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

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
