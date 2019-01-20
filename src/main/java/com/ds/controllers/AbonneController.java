package com.ds.controllers;

import com.ds.service.AboService;
import com.ds.service.AboServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.StringReader;

public class AbonneController extends HttpServlet {
    private static final String numero="0000000000000000";
    private static final String chiff="222";
    private static final String dateC="1111";
    private static final String Abonnee="/WEB-INF/abonnee.jsp";
    private static final String Succees="/WEB-INF/succes.jsp";
    private static final String Session="sessionAgent";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numCarte=request.getParameter("numcarte");
        //String date=request.getParameter("datecarte");
        String chiffre=request.getParameter("chiffcarte");
        String numeroAbo=request.getParameter("num");


        if(!numCarte.equals(numero)|| !chiffre.equals(chiff)){
            this.getServletContext().getRequestDispatcher(Abonnee).forward(request,response);
        }
        else{
            AboService as=new AboServiceImp();
            //on valide le numero du compte et le montant et on le valide
            as.validate(Integer.valueOf(numeroAbo));
            this.getServletContext().getRequestDispatcher(Succees).forward(request,response);
            }
        }
}
