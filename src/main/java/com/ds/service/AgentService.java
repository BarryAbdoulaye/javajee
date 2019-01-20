package com.ds.service;

import com.ds.beans.Abonnee;
import com.ds.beans.Agent;
import com.ds.dao.DaoAgent;
import com.ds.dao.DaoAgentImp;

import java.util.List;
public interface AgentService  {
    public Agent login(String login, String mdp);
    public List<Abonnee> selectAllAbo();
}
