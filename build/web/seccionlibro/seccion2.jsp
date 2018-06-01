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
                                            Registro de Libros:
                                        </div>

                                        <!-- div.table-responsive -->

                                        <!-- div.dataTables_borderWrap -->
                                        <div>
                                            <form action="LibroControl" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        ISBN:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                        <input type="text" name="isbn" value="" placeholder="ISBN" />
                                                    </div>
                                                </div>


                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Titulo:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                        <input type="text" name="titulo" value="" placeholder="Titulo del Libro" />
                                                    </div>
                                                </div>




                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Autor:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                        <input type="text" name="autor" value="" placeholder="Autor" />
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                       Fecha de Publicacion:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                        <input type="text" name="publicacion" value="" placeholder="2018-30-05" />
                                                    </div>
                                                </div>



                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Categoria:
                                                    </label>
                                                    <select name="categoria">
                                                        <option value="0">Seleccione una categoria</option>

                                                        <%for (Categoria c : CategoriaDao.listar()) {%>
                                                        <option value="<%=c.getCodigo()%>">"<%=c.getNombre()%>"</option>
                                                        <%} %>
                                                    </select>
                                                </div>




                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Nit Editorial:
                                                    </label>
                                                    <div class="col-sm-9" >
                                                        <select name="editorial">
                                                            <option value="0">Seleccione una editorial</option>
                                                            <%for (Editorial c : EditorialDao.listar()) {%>
                                                            <option value="<%=c.getNit()%>">"<%=c.getNombre()%>"</option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Descripción:
                                                    </label>
                                                    <div class="col-sm-9" ><textarea name="descripcion" rows="4" cols="20"></textarea>
                                                    </div>
                                                </div>

                                                <button name="accion" value="registrar" class="btn btn-success" type="submit" >
                                                    <i class="fa fa-save"></i>
                                                    Registrar
                                                </button>
                                                <button name="accion" value="actualizar" class="btn btn-warning" type="submit" >
                                                    <i class="fa fa-edit"></i>
                                                    Actualizar
                                                </button>
                                                <button name="accion" value="eliminar" class="btn btn-danger" type="submit" >
                                                    <i class="fa fa-clock-o"></i>
                                                    Eliminar
                                                </button>
                                                <div>
                                                    <%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%>
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