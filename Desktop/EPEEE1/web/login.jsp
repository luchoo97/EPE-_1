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
        <title>ACCESO A USUARIO</title>
        
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
                    <a href="" class="navbar-brand">
                        <small>
                            <i class="fa fa-book"></i>
                            Biblioteca H&L
                        </small>
                    </a>
                </div>
            </div>
        </div>
           
        <body>
                <div>
                    <div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">Inicio de Sesión</h3>
			 	</div>
			  	<div class="panel-body">
			    	<form accept-charset="UTF-8" role="form" action="validar.jsp" method="POST">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="Usuario" name="f_nombre" type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="Contraseña" name="f_clave" type="password" value="">
			    		</div>
			    		
                            <input class="btn btn-lg btn-success btn-block" type="submit" value="Enviar">
                                        
                                               
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
        
                </div>
                        
                        <div class="footer">
				<div class="footer-inner">
					<div class="footer-content">
						<span class="bigger-120">
							Héctor Navarro-Luis Sánchez &copy; 2018
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>
				</div>
			</div>
                    </body>
    </body>
</html>
