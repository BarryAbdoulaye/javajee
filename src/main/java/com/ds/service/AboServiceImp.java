package com.ds.service;

import com.ds.beans.Abonnee;
import com.ds.dao.DaoAbo;
import com.ds.dao.DaoAboImp;

public class AboServiceImp implements AboService {
    DaoAbo abo=new DaoAboImp();
    public Abonnee login(String login, String mdp) {
        return abo.login(login,mdp);
    }
    public void validate(int num) {
        abo.validatePai(num);
    }
}
