package com.ds.service;

import com.ds.beans.Abonnee;

public interface AboService {
    public Abonnee login(String nom, String mdp);
    public void validate(int num);
}
