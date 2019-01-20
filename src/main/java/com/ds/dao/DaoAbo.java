package com.ds.dao;

import com.ds.beans.Abonnee;

public interface DaoAbo {
    public Abonnee login(String login, String mdp);
    public void validatePai(int numAbo);
}
