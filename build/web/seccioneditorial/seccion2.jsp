 <div class="page-header">
                            <h1>
                                Gestionar los libros
                                <small>
                                    <i class="ace-icon fa fa-angle-double-right"></i>
                                    Lista de libros
                                </small>
                            </h1>
                        </div><!-- /.page-header -->

                        <div class="row">
                            <div class="col-xs-12">
                                <!-- PAGE CONTENT BEGINS -->
                                <!-- /.row -->

                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="table-header">
                                            Registro de Editoriales
                                        </div>

                                        <!-- div.table-responsive -->

                                        <!-- div.dataTables_borderWrap -->
                                        <div>
                                            <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Nit:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="nit" value="" placeholder="Codigo de la categoria" />
                                                    </div>
                                                </div>
                                                
                                                 <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Nombre:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="nombre" value="" placeholder="Nombre de la categoria" />
                                                    </div>
                                                </div>
                                                      <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Telefono:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="telefono" value="" placeholder="Autor de la categoria" />
                                                    </div>
                                                </div>
                                                            <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Direccion:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="direccion" value="" placeholder="Autor de la categoria" />
                                                    </div>
                                                </div>
                                                                  <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Email:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="email" value="" placeholder="Autor de la categoria" />
                                                    </div>
                                                </div>
                                                                        <form action="EditorialControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Sitioweb:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                         <input type="text" name="sitioweb" value="" placeholder="Autor de la categoria" />
                                                    </div>
                                                </div>
                                                          
                                                          <button class="btn btn-success" type="submit">
                                                              <i class="fa fa-save"></i>
                                                              Registrar
                                                          </button>
                                                          <div>
                                                              <%=(request.getAttribute("mensaje")!= null?request.getAttribute("mensaje"):"")%>
                                                          </div>
                                                           
                                            </form>
                                        </div>
                                        


                                    </div><!-- /.modal-content -->
                                </div><!-- /.modal-dialog -->
                            </div>

                            <!-- PAGE CONTENT ENDS -->
                        </div><!-- /.col -->
                    </div><!-- /.row -->
                </div><!-- /.page-content -->
            </div>
        </div><!-- /.main-content -->

