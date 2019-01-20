package com.ds.controllers;

import com.ds.beans.Abonnee;
import com.ds.beans.Agent;
import com.ds.service.AboService;
import com.ds.service.AboServiceImp;
import com.ds.service.AgentService;
import com.ds.service.AgentServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {


    private static final String NOM="nom";
    private static final String PRENOM="prenom";
    private static final String LOGIN="login";
    private static final String NUMERO="numero";
    private static final String MONTANT="montant";
    private static final String MDP= "mdp";
    private static final String LOGIN_PAGE="/WEB-INF/authentification.jsp";
    private static final String ABONNEE="/WEB-INF/abonnee.jsp";
    private static final String AGENT_CONTROLLER="/agent";
    private static final String Session="sessionUtilisateur";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username=request.getParameter(LOGIN);
        String password=request.getParameter(MDP);

        //si c'est selon l'abonnée
        if(request.getParameter("type").equals("abo")){
            HttpSession session=request.getSession();
            AboService abs=new AboServiceImp();
            Abonnee a=abs.login(username,password);
            if(a!=null){
                request.setAttribute(NOM,a.getNom());
                request.setAttribute(PRENOM,a.getPrenom());
                request.setAttribute(NUMERO,a.getNumAbon());
                request.setAttribute(MONTANT,a.getMontant());
                this.getServletContext().getRequestDispatcher(ABONNEE).forward(request,response);
            }
            else
            {
                this.getServletContext().getRequestDispatcher(LOGIN_PAGE).forward(request,response);
            }
        }

        //si c'est l'agent
        if(request.getParameter("type").equals("agent")){
            AgentService as=new AgentServiceImp();
            Agent a=as.login(username,password);
            if(a!=null){
                this.getServletContext().getRequestDispatcher(AGENT_CONTROLLER).forward(request,response);
            }
            /*else{
                this.getServletContext().getRequestDispatcher(LOGIN_PAGE).forward(request,response);
            }*/
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher(LOGIN_PAGE).forward(request,response);
    }
}
