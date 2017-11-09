package com.pixalione.quiz.Models;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class Compte {

    private static int CODE = 0;

    private int numeroCompte;
    private float solde;
    private Client propretaire;


    public Compte() {}

    public Compte(Client propretaire) {
        this.propretaire = propretaire;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Client getPropretaire() {
        return propretaire;
    }

    public void setPropretaire(Client propretaire) {
        this.propretaire = propretaire;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                ", solde=" + solde +
                ", propretaire=" + propretaire +
                '}';
    }

    public void Afficher(){
        System.out.println(this.getPropretaire());
    }

    public void Crediter(float somme){
        this.setSolde(this.solde + somme);
    }

    public boolean Debiter(float somme){
        if(this.getSolde() > 0){
            this.setSolde(this.getSolde() - somme);
            return true;
        }else
            return false;
    }

    public void Crediter (float somme, Compte compte){
        if(compte.Debiter(somme))
            this.Crediter(somme);
    }

    public boolean Debiter(float somme, Compte compte){
        if(this.Debiter(somme)){
            compte.Crediter(somme);
            return true;
        }else
            return false;
    }

    public static void resume(Compte compte){
        System.out.println(compte);
    }
}
