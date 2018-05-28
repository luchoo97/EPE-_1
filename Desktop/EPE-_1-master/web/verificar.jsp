<%-- 
    Document   : verificar
    Created on : 27-may-2018, 22:06:53
    Author     : Héctor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="cuadro">
            <div id="cabeza">Login</div>
            <div id="cuerpo">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputEmail3" placeholder="usuario">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                        </div>
                    </div>
                  
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Sign in</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </body>
</html>
<%--
          <%  String usuario, Contraseña;%>
          <%
      usuario = request.getParameter("usuario");
      Contraseña = request.getParameter("Contrasenia");
      if(usuario.equals("luis")||(usuario.equals("hector"))&&Contraseña.equals("1234"))
      
      %>
      <jsp:forward page="index.jsp"/> 
      <% else
         %>
         Wrong Error: Ingrese nuevamente Usuario o Contraseña!!!
         <jsp:include page="index.jsp"/>
--%>