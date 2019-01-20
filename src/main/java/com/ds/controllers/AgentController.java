package com.ds.controllers;

import com.ds.beans.Abonnee;
import com.ds.dao.DaoAgent;
import com.ds.dao.DaoAgentImp;
import jdk.internal.dynalink.linker.LinkerServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AgentController extends HttpServlet {
    private static final String AGENCE="/WEB-INF/agent.jsp";
    private static final String EMPLOYE="liste";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DaoAgent da=new DaoAgentImp();
        List<Abonnee> list=da.selectAllAbo();
        request.setAttribute(EMPLOYE,list);
        this.getServletContext().getRequestDispatcher(AGENCE).forward(request,response);
    }
}
