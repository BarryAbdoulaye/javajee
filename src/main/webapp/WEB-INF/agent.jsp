<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 1/19/19
  Time: 3:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Agent</title>
</head>
<body>
<div align="center">
    <table>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>NumAbo</th>
            <th>Montant</th>
            <th>paiement</th>
        </tr>
        <c:forEach var="abo" items="${liste}">
            <tr>
                <td><c:out value="${abo.nom}" /></td>
                <td><c:out value="${abo.prenom}"/></td>
                <td><c:out value="${abo.numAbon}"/></td>
                <td><c:out value="${abo.montant}"/></td>
                <td><c:out value="${abo.etatPayement}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
