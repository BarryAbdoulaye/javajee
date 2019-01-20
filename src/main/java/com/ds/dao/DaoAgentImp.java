package com.ds.dao;

import com.ds.beans.Abonnee;
import com.ds.beans.Agent;
import javafx.scene.paint.LinearGradient;

import javax.persistence.*;
import java.util.List;

public class DaoAgentImp implements DaoAgent {

    private static  final String JPQL_LOG="SELECT a FROM Agent a WHERE a.login=:login AND a.mdp=:mdp";
    private static  final String JPQL="SELECT ab FROM Abonnee ab";
    private static  final String LOGIN="login";
    private static  final String PASSWORD="mdp";

    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("user");
    EntityManager em= emf.createEntityManager();;
    EntityTransaction transaction = em.getTransaction();

    //une methode qui retourne la liste des abonnées
    public List<Abonnee> selectAllAbo() {
        Query q=em.createQuery(JPQL);
        List<Abonnee> abonnees=(q.getResultList());
        return abonnees;
    }

    //pour se logger en tant qu'agent
    public Agent login(String login, String mdp) {
        Query query=em.createQuery(JPQL_LOG);
        query.setParameter(LOGIN,login);
        query.setParameter(PASSWORD,mdp);
        return (Agent) query.getSingleResult();

}
}
