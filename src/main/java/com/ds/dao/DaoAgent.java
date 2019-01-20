package com.ds.dao;

import com.ds.beans.Abonnee;
import com.ds.beans.Agent;

import java.util.List;

public interface DaoAgent {

    public List<Abonnee> selectAllAbo();
    public Agent login(String login, String mdp);
}
