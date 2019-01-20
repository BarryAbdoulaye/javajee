<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 1/19/19
  Time: 3:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/abonnee">
        <div>
            <p>
                Nom et Prenom : <c:out value="${nom}"/>
                <c:out value="${prenom}"/>
            </p>
        </div>
        <div>
            <p>
                Numero : <c:out value="${numero}"/>
            </p>
        </div>
        <div>
            <p>Montant : <c:out value="${montant}"/></p>
        </div>
        <div>
            <label>Numero de carte</label>
            <input type="number" maxlength="16" name="numcarte">
        </div>
        <div>
            <label>Date Expiration :</label>
            <input type="date" name="datecarte">
        </div>
        <div>
            <label>Trois derniers chiffres</label>
            <input type="number" name="chiffcarte" maxlength="3">
        </div>
        <div>
           <input type="hidden" value="${numero}" name="num">
        </div>
        <div>
            <input type="submit" value="valider">
        </div>
    </form>
</body>
</html>
