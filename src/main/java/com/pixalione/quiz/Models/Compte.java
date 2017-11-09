package com.pixalione.quiz.Models;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class Compte {

    private static int CODE = 0;

    private int numeroCompte;
    private float solde;
    private Client propretaire;


    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                ", solde=" + solde +
                ", propretaire=" + propretaire +
                '}';
    }
}
