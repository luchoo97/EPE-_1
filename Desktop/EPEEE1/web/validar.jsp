<%-- 
    Document   : validar
    Created on : 28-05-2018, 17:52:59
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%!
            String s_usuario;
            String s_clave;
            %>
    </head>
    <body>
        <%
            s_usuario=request.getParameter("f_nombre");
            s_clave=request.getParameter("f_clave");
        if(s_usuario.equals("ipchile") && s_clave.equals("1234"))    
        {
            out.println("<script> alert('BIENVENIDO ADMINISTRADOR');"
                    + "location.href='index.jsp';"
                    + "  </script>");
            
            
            
        }
        else{
              out.println("<script> alert('ERROR EN LOS DATOS');"
                    + "location.href='login.jsp';"
                    + "  </script>");
        }
        %>
    </body>

</html>
