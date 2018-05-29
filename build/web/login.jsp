<%-- 
    Document   : login
    Created on : 28-05-2018, 17:46:41
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="css.jsp" %>
    </head>
    <body>
        <body class="no-skin">
        <div id="navbar" class="navbar navbar-default          ace-save-state">
            <div class="navbar-container ace-save-state" id="navbar-container">
                <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
                    <span class="sr-only">Toggle sidebar</span>

                    <span class="icon-bar"></span>

                    <span class="icon-bar"></span>

                    <span class="icon-bar"></span>
                </button>
                
                <div class="navbar-header pull-left">
                    <a href="index.jsp" class="navbar-brand">
                        <small>
                            <i class="fa fa-book"></i>
                            Biblioteca H&L
                        </small>
                    </a>
                </div>

                <div>
        <form action="validar.jsp" method="POST">
            <table border="1" aling="center">
                
                <tbody>
                    <tr>
                        <td>Uusuario:</td>
                        <td><input type="text" name="f_nombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contraseña:</td>
                        <td><input type="password" name="f_clave" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enviar" /></td>
                
                        
                    </tr>
                </tbody>
            </table>
            

        </form>
                </div>
    </body>
</html>
