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
    </head>
    <body>
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
    </body>
</html>
