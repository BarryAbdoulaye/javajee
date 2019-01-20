package com.ds.dao;

import com.ds.beans.Abonnee;

import javax.persistence.*;

public class DaoAboImp implements DaoAbo {

    private static  final String JPQL_LOG="SELECT a FROM Abonnee a WHERE a.login=:login AND a.mdp=:mdp";
    private static  final String JPQL_PAY="SELECT a FROM Abonnee a WHERE a.numAbon=:numAbon";
    private static  final String NumAbo="numAbon";
    private static  final String USERNAME="login";
    private static  final String PASSWORD="mdp";

    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("user");
    EntityManager em= emf.createEntityManager();
    EntityTransaction transaction = em.getTransaction();

    //une methode pour valider le paiement
    public void validatePai(int numAbo) {

        em.getTransaction().begin();
        Query query=em.createQuery(JPQL_PAY);
        query.setParameter(NumAbo,numAbo);
        Abonnee a=(Abonnee)query.getSingleResult();
        if(!a.isEtatPayement()){
            a.setEtatPayement(true);
            em.getTransaction().commit();
        }
    }

    //une methode pour se connecter
    public Abonnee login(String login, String mdp) {
        Abonnee abonnee=null;
        Query query=em.createQuery(JPQL_LOG);
        query.setParameter(USERNAME,login);
        query.setParameter(PASSWORD,mdp);
        Abonnee a=(Abonnee) query.getSingleResult();
        if(a!=null) {
            abonnee=a;
        }
        return abonnee;
    }
}
