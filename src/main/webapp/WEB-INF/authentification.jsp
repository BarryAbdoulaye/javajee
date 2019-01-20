<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 1/8/19
  Time: 1:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
<div align="center">
    <form action="/login" method="POST">
        <div>
            <select name="type">
                <option value="agent">Agent</option>
                <option value="abo">Abonné</option>
            </select>
        </div>
        <div>
            <label>Entrer Login : </label>
            <input type="text" name="login" required="required"> <br> <br>
        </div>
        <div>
            <label>Enter Mot de passe : </label>
            <input type="password" name="mdp" required="required"> <br> <br>
        </div>
        <div>
            <input type="submit" value="Se connecter">
        </div>

    </form>
</div>
</body>
</html>
