<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	




        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Programación de Mantenimientos
            </h1>           
        </section>


        <!-- Main content -->
        <section class="content container-fluid">

                
                <div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
                    <!-- general form elements -->
                    <div class="box box-danger">
                        <div class="box-body">
                            <div class="form-group col-sm-12 col-md-4 col-lg-3">
                                <label for="entidad" style="display: block;">Entidad</label>
                                <div>
                                    <select name="entidades" class="selectpicker show-menu-arrow form-control"  id="entidades"></select>
                                </div>
                                
                            </div>
                               <div class="form-group col-sm-12 col-md-3 col-lg-3 control-label top-5 padding-bottom-10"> 
							       <label>Desde</label>
	                                <div>
	                                    <div class="input-group date d-flex">
	                                        <div class="input-group-addon" style="width: 38px;">
	                                            <i class="fa fa-calendar"></i>
	                                        </div>
	                                        <input type="text" class="form-control pull-right date-form" name="fechadesdemant" id="dp-fechadesde-man" data-date-start-date="0d" />
	                                    </div>
	                                </div>
								</div> 
								 <div class="form-group col-sm-12 col-md-3 col-lg-3 control-label top-5 padding-bottom-10"> 
							       <label for="tipo-mensaje">Hasta</label>
	                                <div>
	                                    <div class="input-group date d-flex">
	                                        <div class="input-group-addon" style="width: 38px;">
	                                            <i class="fa fa-calendar"></i>
	                                        </div>
	                                        <input type="text" class="form-control pull-right date-form" name="fechahastamant" id="dp-fechahasta-man" data-date-start-date="0d" />
	                                    </div>
	                                </div>
								</div>  
                            
	                            <div class="form-group col-sm-12 col-md-4 col-lg-3 " style="padding-top: 30px;">
	                              
	                                  <button type="button" class="btn btn-primary" id="btn-execute-registrar-man">Grabar</button>
	                                  
	                                  
	                                  <button type="button" class="btn btn-primary" id="btn-execute-editar-man" style="display: none;">Grabar</button>
	                                  
	                            
	                                  <button type="button" class="btn btn-primary" id="btn-execute-limpiar" onclick="limpiar();" style="display: none;">Limpiar</button>
	                                
	                                
	                            </div> 
                            
                        </div>
                    </div>
                </div>
                <div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
                    <!-- general form elements -->
                    <div class="box box-danger">

                        <div class="box-body">

							<table id="tb-mantenimiento-entidad" class="table table-striped table-bordered" role="grid" aria-describedby="tb-mantenimiento-entidad">
                                    <thead>
                                        <tr role="row">
                                            <th  style="text-align: center;" tabindex="0" rowspan="1" colspan="1">#</th>
                                            <th  style="text-align: center;" tabindex="1" rowspan="1" colspan="1">Entidad</th>
                                            <th  style="text-align: center;" tabindex="2" rowspan="1" colspan="1">Fecha Inicio</th>
                                            <th  style="text-align: center;" tabindex="3" rowspan="1" colspan="1">Fecha Fin</th>  
                                            <th  style="text-align: center;width: 320px;" tabindex="4" rowspan="1" colspan="1">Opciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                        </div>
                     </div>
               </div>         
        </section>  
	