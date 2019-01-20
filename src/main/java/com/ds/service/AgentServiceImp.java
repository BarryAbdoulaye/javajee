package com.ds.service;

import com.ds.beans.Abonnee;
import com.ds.beans.Agent;
import com.ds.dao.DaoAgent;
import com.ds.dao.DaoAgentImp;

import java.util.List;

public class AgentServiceImp implements AgentService{

    DaoAgent d=new DaoAgentImp();

    public List<Abonnee> selectAllAbo() {

        return  d.selectAllAbo();
    }
    public Agent login(String login, String mdp) {
        return d.login(login,mdp);
    }
}
