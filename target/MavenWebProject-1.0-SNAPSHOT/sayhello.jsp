<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <h1>SayHello.jsp</h1>
        <% String lang = request.getParameter("lang"); %>
        <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
        <jsp:getProperty name="myBean" property="msg"/> <%=request.getParameter("nome")%>!
    </body>
</html>--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>JSP SayHello.jsp</title>

    <link rel="icon" href="https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jj.css">
    <link rel="stylesheet" href="fontawesome/css/all.css">
    <link rel="stylesheet" href="fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="css/jumbotron.css">
</head>

<body>

<nav id="navbar" class="navbar navbar-custom navbar-light navbar-expand-lg fixed-top">
    <div id="navbarcont" class="container">
        <a class="navbar-brand" href="index.html">
            <img src="https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg" alt="" width="120" height="80">
        </a>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
                <img src="https://sites.google.com/a/ic.uff.br/fernanda/_/rsrc/1489691433727/home/logo-ic-uff.png" alt="" width="120" height="80">
            </li>
        </ul>
    </div>
</nav>

<main role="main">
    <jsp:useBean id="myBean" class="hello.MessageBean"/>
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">Olá Mundo utilizando JSP!</h1>
            <br>
            <p><% String lang = request.getParameter("lang"); %>
                <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
                <jsp:getProperty name="myBean" property="msg"/><%=request.getParameter("nome")%>! Estamos utilizando Beans com a classe SayHello.jsp!
            </p>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <p>Clique abaixo para voltar para a Página Inicial</p>
                <p><a class="btn btn-secondary btn-lg" href=".\index.html" role="button">Voltar</a></p>
            </div>
        </div>
        <hr>
    </div>

</main>

<footer class="container">
    <p>© Copyright 2021 · José Emiliano Bertholdo Júnior · Instituto de Computação/UFF · Desenvolvimento de Aplicações Corportativas</p>
</footer>

<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jj.js"></script>
</body>

</html>
