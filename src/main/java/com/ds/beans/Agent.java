package com.ds.beans;

//import org.hibernate.annotations.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
    @Id
    private int id;
    private String login;
    private String mdp;

    /*
    * les getters*/

    public int getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }

    public String getLogin() {
        return login;
    }
    /*les setters*/
    public void setId(int id) {
        this.id = id;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
