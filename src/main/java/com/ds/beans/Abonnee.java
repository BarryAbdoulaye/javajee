package com.ds.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Abonnee {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private int numAbon;
    private double montant;
    private boolean etatPayement;

    /*les gettters*/

    public int getId() {
        return id;
    }

    public boolean isEtatPayement() {
        return etatPayement;
    }

    public int getNumAbon() {
        return numAbon;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getMontant() {
        return montant;
    }
    /*les setters*/

    public void setId(int id) {
        this.id = id;
    }

    public void setEtatPayement(boolean etatPayement) {
        this.etatPayement = etatPayement;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumAbon(int numAbon) {
        this.numAbon = numAbon;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
