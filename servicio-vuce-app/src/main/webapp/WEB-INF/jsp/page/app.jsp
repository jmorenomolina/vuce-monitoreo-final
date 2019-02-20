<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	
 <!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>Monitoreo de Incidentes</h1>
		</section>


		<!-- Main content -->
		<section class="content container-fluid">

			<div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
				<!-- general form elements -->
				<div class="box box-danger">
					<div class="box-header with-border">
						<form id="form-tramisiones-incidentes" method="GET">

							<label for="desde"
								class="col-sm-12 col-md-3 col-lg-2 control-label text-right top-5 padding-bottom-10">Desde</label>
							<div class="col-sm-12 col-md-3 col-lg-2 padding-bottom-10">
								<div class="input-group date">
									<div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									</div>
									<input type="text" class="form-control pull-right date-form"
										name="fechadesde" id="dp-fechadesde-tra-inc"
										data-date-end-date="0d" />
								</div>
							</div>

							<label for="tipo-mensaje"
								class="col-sm-3 col-md-3 col-lg-2 control-label text-right top-5 padding-bottom-10">Hasta</label>
							<div class="col-sm-12 col-md-3 col-lg-2 padding-bottom-10">
								<div class="input-group date">
									<div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									</div>
									<input type="text" class="form-control pull-right date-form"
										name="fechahasta" id="dp-fechahasta-tra-inc"
										data-date-start-date="-60d" data-date-end-date="0d" />
								</div>
							</div>


						</form>
					</div>
					<div class="box-body">
						<div style="width: 95%"
							id="parent-transmisiones-incidentes-entidad">
							<canvas id="transmisiones-incidentes-entidad"></canvas>
						</div>

					</div>
				</div>


				<div class="box box-danger">
					<div class="box-header with-border">
					
					
						 	<form id="form-tramisiones" method="GET">
						
							<div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10">
                                <label for="entidades">Entidades</label>
                                <div>
                                    <select name="entidades" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="entidades"></select>
                                </div>
                            </div>
                            <div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10">    
                                <label for="tipo-mensaje">Tipo de Mensaje</label>
                                <div>
                                    <select name="tipomensajes" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="tipomensajes"></select>
                                </div>
                            </div>  
                            <div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10">    
                                <label for="tipo-documentos" >Tipo de documento</label>
                                <div>
                                    <select name="tipo-documentos" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="tipo-documentos"></select>
                                </div>                                   
                            </div>
							
						   
							
								
						    <div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10"> 
						       <label>Desde</label>
                                <div>
                                    <div class="input-group date d-flex">
                                        <div class="input-group-addon" style="width: 38px;">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <input type="text" class="form-control pull-right" name="fechadesde" id="dp-fechadesde-tra" data-date-start-date="-60d" data-date-end-date="0d"/>
                                    </div>
                                </div>
							</div> 
							 <div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10"> 
						       <label for="tipo-mensaje">Hasta</label>
                                <div>
                                    <div class="input-group date d-flex">
                                        <div class="input-group-addon" style="width: 38px;">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <input type="text" class="form-control pull-right" name="fechahasta" id="dp-fechahasta-tra" data-date-start-date="-60d" data-date-end-date="0d"/>
                                    </div>
                                </div>
							</div> 
							
							<div class="form-group col-sm-12 col-md-3 col-lg-4 control-label top-5 padding-bottom-10"> 
						    <label for="tipo-documentos">N&#250;mero de Documento</label>
                                <div>
                                    <input type="text" class="form-control" id="nrodocumento" name="nrodocumento" />
                                </div> 
							</div> 
							
							
							<div class="form-group col-sm-12 col-md-6 col-lg-6 control-label top-5 padding-bottom-10"> 
						   	    <label for="tipo-transmision">Tipo de Transmisi&#243;n</label>
                                <div>
                                    <select name="tipo-transmision" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="tipo-transmision"></select>
                                </div>
							</div> 
							<div class="form-group col-sm-12 col-md-6 col-lg-6 control-label top-5 padding-bottom-10"> 
						    	<label for="tipo-incidente">Tipo de Incidente</label>
                                <div>
                                    <select name="tipo-incidente" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="tipo-incidente"></select>
                                </div>
							</div> 
							
							
							
							<div class="form-group col-sm-12 col-md-6 col-lg-6 control-label top-5 padding-bottom-10"> 
						    	<label for="estado-vc-central">Estado en VUCE-Central</label>
                                <div>
                                    <select name="estado-vc-central" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="estado-vc-central"></select>
                                </div>
							</div> 
							
							<div class="form-group col-sm-12 col-md-6 col-lg-6 control-label top-5 padding-bottom-10"> 
						       <label for="estado-vc-entidad">Estado en VUCE-Entidad</label>
                                <div>
                                    <select name="estado-vc-entidad" class="selectpicker show-menu-arrow form-control" multiple="multiple" data-max-options="10" id="estado-vc-entidad"></select>
                                </div>                              
							</div> 						
							
							<div class="form-group col-sm-12 col-md-4 col-lg-4 control-label top-5 padding-bottom-10"> 
						    <label for="vc-id">VC ID</label>
                                <div>
                                    <input type="text" class="form-control" id="vc-id" name="vc-id" />
                                </div> 
							</div> 
							
							<div class="form-group col-sm-12 col-md-4 col-lg-4 control-label top-5 padding-bottom-10"> 
						    <label for="ve-id">VE ID</label>
                                <div>
                                    <input type="text" class="form-control" id="ve-id" name="ve-id" />
                                </div> 
							</div> 
							
							<div class="form-group col-sm-12 col-md-4 col-lg-4">
								<label for="ve-id"></label>
								<div style="margin-top: 10px;">
									<button type="button" class="btn btn-primary" id="btn-filtrar-transmisiones">Filtrar Transmisiones</button>
								 </div> 
							</div>
							
							<div class="form-group col-sm-12 col-md-12 col-lg-12">
								
								<button type="button" class="btn btn-primary margin-top-10" id="btn-restablecer-fitro">Restablecer filtro</button>
								<button type="button" class="btn btn-primary margin-left-10 margin-top-10" id="btn-configurar-slas" data-toggle="modal" data-target="#modal-configurar-sla">Configurar SLAs</button>
								<button type="button" class="btn btn-primary margin-left-10 margin-top-10" id="btn-detener-transmisiones">Detener Transmisiones</button>
								<button type="button" class="btn btn-primary margin-left-10 margin-top-10" id="btn-reprocesar-n8-con-error">Reprocesar N8 con errores</button>
							</div>
						
						</form>
						
						
					</div>
					<div class="box-body">
					
			
					
					</div>
				</div>
			</div>



			
				<div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
					<!-- general form elements -->
					<div class="box box-danger">
						<div class="box-header with-border">
							<h3 class="box-title">
								Transmisiones de Salida
							</h3>

							

						</div>
						<div class="box-body">
							<div class="form-group" style="float: left;width: 100%;">
									
										<ul class="head-list-table">
										  <li>
										  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-0" data-toggle="tooltip"></div>
										  	 <label style="font-size: 12px;">Tx sin errores</label>								  	 
										  </li>
										  
										  <li>
										  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-1" data-toggle="tooltip"></div>
										  	 <label style="font-size: 12px;">1 - Incumplimiento de acuerdo de confirmación de una Tx de salida</label>								  	 
										  </li>
										  
										  <li>
										  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-2" data-toggle="tooltip"></div>
		                                        <label style="font-size: 12px;">2-Tx de salida confirmada con error</label>					  	 
										  </li>
										  <li>
										  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-5" data-toggle="tooltip"></div>
		                                        <label style="font-size: 12px;">5-Incumplimiento de acuerdo de disponibilidad de una Tx de salida </label>				  	 
										  </li>
										   
										 
										</ul>
		                              
		                            </div>
		                            
		                            
		                            <div class="col-sm-12">
		                                <table id="tb-transmisiones-salida" class="table table-striped table-bordered" role="grid" aria-describedby="tb-transmisiones-salida">
		                                    <thead>
		                                        <tr role="row">
		                                            <th  style="text-align: center;" tabindex="0" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">#</th>
		                                            <th  style="text-align: center;" tabindex="1" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1"></th>
		                                            <th  style="text-align: center;" tabindex="2" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Tipo</th>
		                                            <th  style="text-align: center;" tabindex="3" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Entidad</th>                                            
		                                            <th  style="text-align: center;" tabindex="4" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Trámite</th>                                            
		                                            <th  style="text-align: center;" tabindex="5" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">CV Id</th>
		                                            <th  style="text-align: center;" tabindex="6" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Estado VC</th>
		                                            <th  style="text-align: center;" tabindex="7" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">VE Id</th>
		                                            <th  style="text-align: center;" tabindex="8" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Estado VE</th>
		                                            <th  style="text-align: center;" tabindex="9" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Mensaje</th>
		                                            <th  style="text-align: center;" tabindex="10" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Documento</th>
		                                            <th  style="text-align: center;" tabindex="11" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Nro Documento</th>                                            
		                                            <th  style="text-align: center;" tabindex="12" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Fec. Registro</th>
		                                            <th  style="text-align: center;" tabindex="13" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Fec. Actualizaci&#243;n</th>
		                                            <th  style="text-align: center;" tabindex="14" class="sorting" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Antiguedad</th>                                        
		                                            <th  style="text-align: center;" tabindex="15" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">XML</th>
		                                            <th  style="text-align: center;" tabindex="16" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">EbXML</th>
		                                            <th  style="text-align: center;" tabindex="17" aria-controls="tb-transaccion-incidente" rowspan="1" colspan="1">Error</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody>
		                                    </tbody>
		                                </table>
		                            </div>
		                            
		                            
		                            <div class="form-group col-sm-12 col-md-12 col-lg-12">
			                            
			                            <label class="col-sm-12 col-md-3 col-lg-2 control-label top-5 padding-bottom-10"  for="tipo-documentos"  style="margin-top: 10px;">Cantidad de filas a mostrar</label>
			                            <div   class="col-sm-12 col-md-3 col-lg-1 padding-bottom-10" style="margin-top: 10px;" >
			                                  <input type="text" class="form-control" id="cantidad-filas-mostrar" name="cantidad-filas-mostrar" value="10" onkeyup="util.setTamanoTableSalida();" />
			                            </div> 
			                            
		                            </div>
		                            
		                            
		                            <br/>
		                            
		                            <div class="form-group col-sm-12 col-md-12 col-lg-12">
		                            
			                            <div class="checkbox col-sm-12 col-md-6 col-lg-5 padding-bottom-10">
						                  <label class="col-sm-12 col-md-12 col-lg-12"  >
						                    <input style="position: relative;top: 0px;cursor:pointer;" type="checkbox" id="ck-transmisiones-salida-error" name="ck-transmisiones-salida-error" disabled="disabled" /> <b>Seleccionar todas las Tx de salida confirmada con error</b>
						                  </label>
						                </div>
			                                                     
										<div class="form-group col-sm-12 col-md-12 col-lg-7">								
											<button type="button" class="btn btn-primary margin-top-10" id="btn-reenviar-transmisiones" disabled="disabled"  >Reenviar Tx de salida confirmada con error</button>
											<button type="button" class="btn btn-primary margin-left-10 margin-top-10" id="btn-habilitar-transmisiones" disabled="disabled" >Habilitar transmisiones</button>
										</div>
		                            </div>
		                            
						
						</div>

					</div>
				</div>
				



		
				
				<div class="modal fade" id="modal-habilitar-transmisiones">
                        <div class="modal-dialog modal-sm">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Confirmaci&#243;n</h4>
                                </div>
                                <div class="modal-body">
                                    <p>Esta seguro de habilitar transmisiones?</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-habilitar-transmisiones">Enviar</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               <div class="modal fade" id="modal-reenviar-transmisiones">
                        <div class="modal-dialog modal-sm">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Confirmaci&#243;n</h4>
                                </div>
                                <div class="modal-body">
                                    <p>Esta seguro de reenviar transmisiones procesadas incorrectamente en la entidad?</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-reenviar-transmisiones">Enviar</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                </div>
                <div class="modal fade" id="modal-tb-salida-log">
                         <div class="modal-dialog">
                             <div class="modal-content">
                                 <div class="modal-header">
                                     <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                         <span aria-hidden="true">x</span></button>
                                     <h4 class="modal-title">Resultados de la ejecuci&#243;n</h4>
                                 </div>
                                 <div class="modal-body">
                                     <table id="tb-salida-log" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="tb-salida-log">
                                         <thead>
                                             <tr role="row">
                                                 <th   class="sorting" tabindex="0" rowspan="1" colspan="1">C&#243;digo</th>
                                                 <th   class="sorting" tabindex="0" rowspan="1" colspan="1">Mensaje</th>
                                             </tr>
                                         </thead>
                                         <tbody>
                                         </tbody>
                                     </table>
                                 </div>
                                 <div class="modal-footer">

                                     <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
                                 </div>
                             </div>
                             <!-- /.modal-content -->
                         </div>
                         <!-- /.modal-dialog -->
                  </div>
                
				
				
				
				<div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
					<!-- general form elements -->
					<div class="box box-danger">
						<div class="box-header with-border">
							<h3 class="box-title">
								Transmisiones de Entrada
							</h3>

							

						</div>
						<div class="box-body">
							<div class="form-group" style="float: left;width: 100%;">
							
								<ul class="head-list-table">
								  <li>
								  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-0" data-toggle="tooltip"></div>
								  	 <label style="font-size: 12px;">Tx sin errores</label>								  	 
								  </li>
								  <li>
								  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-3" data-toggle="tooltip"></div>
								  	 <label style="font-size: 12px;">3- Tx de entrada procesada con errores </label>								  	 
								  </li>
								 
								  <li>
								  	 <div title="Breve explicacion sobre el tipo de incidente" class="tipo-transacciones tipo-transacciones-4" data-toggle="tooltip"></div>
                                        <label style="font-size: 12px;">4- Incumplimiento del tiempo de procesamiento de una Tx de entrada</label>				  	 
								  </li>
								</ul>
                              
                            </div>
                            
                            
                            <div class="col-sm-12">
                                <table id="tb-transmisiones-entrada" class="table table-striped table-bordered" role="grid" aria-describedby="tb-transmisiones-entrada">
                                    <thead>
                                        <tr role="row">
                                            <th  style="text-align: center;" tabindex="0" rowspan="1" colspan="1">#</th>
                                            <th  style="text-align: center;" tabindex="1" rowspan="1" colspan="1"></th>
                                            <th  style="text-align: center;" tabindex="2" rowspan="1" colspan="1">Tipo</th>
                                            <th  style="text-align: center;" tabindex="3" rowspan="1" colspan="1">Entidad</th>                                            
                                            <th  style="text-align: center;" tabindex="4" rowspan="1" colspan="1">Trámite</th>                                            
                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1">CV Id</th>
                                            <th  style="text-align: center;" tabindex="6" rowspan="1" colspan="1">Estado VC</th>
                                            <th  style="text-align: center;" tabindex="7" rowspan="1" colspan="1">VE Id</th>
                                            <th  style="text-align: center;" tabindex="8" rowspan="1" colspan="1">Estado VE</th>
                                            <th  style="text-align: center;" tabindex="9" rowspan="1" colspan="1">Mensaje</th>
                                            <th  style="text-align: center;" tabindex="10" rowspan="1" colspan="1">Documento</th>
                                            <th  style="text-align: center;" tabindex="11" rowspan="1" colspan="1">Nro Documento</th>                                            
                                            <th  style="text-align: center;" tabindex="12" rowspan="1" colspan="1">Fec. Registro</th>
                                            <th  style="text-align: center;" tabindex="13" rowspan="1" colspan="1">Fec. Actualizaci&#243;n</th>
                                            <th  style="text-align: center;" tabindex="14" rowspan="1" colspan="1">Antiguedad</th>                                        
                                            <th  style="text-align: center;" tabindex="15" rowspan="1" colspan="1">XML</th>
                                            <th  style="text-align: center;" tabindex="16" rowspan="1" colspan="1">EbXML</th>
                                            <th  style="text-align: center;" tabindex="17" rowspan="1" colspan="1">Error</th>
                                            <th  style="text-align: center;" tabindex="17" rowspan="1" colspan="1">Adicional</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                            </div>
                            
                            <div class="form-group col-sm-12 col-md-12 col-lg-12">
		                          
	                            <label for="tipo-documentos" class="col-sm-12 col-md-3 col-lg-2 control-label top-5 padding-bottom-10" style="margin-top: 10px;">Cantidad de filas a mostrar</label>
	                            <div class="col-sm-12 col-md-3 col-lg-1 padding-bottom-10" style="margin-top: 10px;" >
	                                  <input type="text" class="form-control" id="cantidad-filas-mostrar-entrada" name="cantidad-filas-mostrar-entrada" value="10" onkeyup="util.setTamanoTableEntrada();" />
	                            </div> 
                            </div> 
                            <br/>
                            
                            <div class="form-group col-sm-12 col-md-12 col-lg-12">
                            
	                            <div class="checkbox col-sm-12 col-md-6 col-lg-5 padding-bottom-10">
				                  <label class="col-sm-12 col-md-12 col-lg-12" >
				                    <input disabled="disabled" style="position: relative;top: 0px;cursor:pointer;" type="checkbox" id="ck-transmisiones-entrada-error" name="ck-transmisiones-entrada-error" /> <b>Seleccionar todas las Tx con errores</b>
				                  </label>
				                </div>
	                                                     
								<div class="form-group col-sm-12 col-md-12 col-lg-7">								
									<button type="button" class="btn btn-primary margin-top-10" id="btn-reeprocesar-transmision" disabled="disabled">Reprocesar transmisiones con errores</button>
									<button type="button" class="btn btn-primary margin-left-10 margin-top-10" id="btn-anular-transmision" disabled="disabled">Anular trasmisiones con errores</button>
								</div>
                            </div>
                            
						
						</div>

					</div>
				</div>
				
				<div class="col-md-12" style="padding-right: 1px; padding-left: 1px;">
					<div class="box box-danger">
						<div class="box-header with-border">
							<h3 class="box-title">
								Frecuencia de lectura de transmisiones de entrada
							</h3>
						</div>
						<div class="box-body">
							<div class="col-sm-12">
                                <table id="tb-frecuencia-lectura" class="table table-striped table-bordered" role="grid" aria-describedby="tb-frecuencia-lectura">
                                    <thead>
                                        <tr role="row">
                                            <th  style="text-align: center;" tabindex="0" rowspan="1" colspan="1">Entidad</th>
                                            <th  style="text-align: center;" tabindex="1" rowspan="1" colspan="1">En Actividad</th>
                                            <th  style="text-align: center;" tabindex="2" rowspan="1" colspan="1">Fec. Lectura Esperada</th>
                                            <th  style="text-align: center;" tabindex="3" rowspan="1" colspan="1">Fec. Lectura Actual</th>                                            
                                            <th  style="text-align: center;" tabindex="4" rowspan="1" colspan="1">Cumpliendo Lectura Esperada</th>                                            
                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1">Fec. Ultima Lecura</th>
                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1">Resultado</th>
                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1">Error</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                            </div>
                            <div style="text-align: right;">
                            	
                            	<a class="btn btn-primary margin-top-10" href="/mantenimientoentidad">Programación de Mantenimientos</a>
                            </div>
						</div>
					</div>
				</div>
				
				
				
				<div class="modal fade" id="modal-reprocesar-transmisiones">
                        <div class="modal-dialog modal-sm">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Confirmaci&#243;n</h4>
                                </div>
                                <div class="modal-body">
                                    <p>Esta seguro de reeprocesar transmisiones seleccionadas?</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-reeprocesar-transmisiones">Reeprocesar</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               
               <div class="modal fade" id="modal-anular-transmisiones">
                        <div class="modal-dialog modal-sm">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Confirmaci&#243;n</h4>
                                </div>
                                <div class="modal-body">
                                    <p>Esta seguro de anular transmisiones seleccionadas?</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-anular-transmisiones">Anular</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               
               
               <div class="modal fade" id="modal-detener-transmisiones">
                        <div class="modal-dialog modal-md">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Detener Trasmisiones</h4>
                                </div>
                                <div class="modal-body" style="height: 165px;">
                                    
		                                <label for="entidades-detener">Entidad</label>
		                                <div>
		                                    <select name="entidades-detener" class="selectpicker show-menu-arrow form-control" data-max-options="10" id="entidades-detener"></select>
		                                    
		                                        
		                               <div class="form-group col-sm-12 col-md-3 col-lg-6 control-label top-5 padding-bottom-10"> 
								       <label>Desde</label>
		                                <div>
		                                    <div class="input-group date d-flex">
		                                        <div class="input-group-addon" style="width: 38px;">
		                                            <i class="fa fa-calendar"></i>
		                                        </div>
		                                        <input type="text" class="form-control pull-right date-form" name="fechadesdedeten" id="dp-fechadesde-det" data-date-start-date="-60d" data-date-end-date="0d"/>
		                                    </div>
		                                </div>
									</div> 
									 <div class="form-group col-sm-12 col-md-3 col-lg-6 control-label top-5 padding-bottom-10"> 
								       <label for="tipo-mensaje">Hasta</label>
		                                <div>
		                                    <div class="input-group date d-flex">
		                                        <div class="input-group-addon" style="width: 38px;">
		                                            <i class="fa fa-calendar"></i>
		                                        </div>
		                                        <input type="text" class="form-control pull-right date-form" name="fechahastadeten" id="dp-fechahasta-det" data-date-start-date="-60d" data-date-end-date="0d"/>
		                                    </div>
		                                </div>
									</div> 
		                                    
		                                    
		                                </div>
		                                
		                            
		                                
		                            
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-detener">Detener</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               
               
                <div class="modal fade" id="modal-reeprocesar-n8">
                        <div class="modal-dialog modal-md">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Reprocesar N8</h4>
                                </div>
                                <div class="modal-body" style="height: 165px;">
                                    
		                                <label for="entidades-reeprocesar-n8">Entidades</label>
		                                <div>
				                              <select name="entidades-reeprocesar-n8" class="selectpicker show-menu-arrow form-control" data-max-options="10" id="entidades-reeprocesar-n8"></select>
				                               
				                              <div class="form-group col-sm-12 col-md-3 col-lg-6 control-label top-5 padding-bottom-10"> 
										       <label>Desde</label>
				                                <div>
				                                    <div class="input-group date d-flex">
				                                        <div class="input-group-addon" style="width: 38px;">
				                                            <i class="fa fa-calendar"></i>
				                                        </div>
				                                        <input type="text" class="form-control pull-right date-form" name="fechadesderepron8" id="dp-fechadesde-reepro" data-date-start-date="-60d" data-date-end-date="0d"/>
				                                    </div>
				                                </div>
											</div> 
											 <div class="form-group col-sm-12 col-md-3 col-lg-6 control-label top-5 padding-bottom-10"> 
										       <label for="tipo-mensaje">Hasta</label>
				                                <div>
				                                    <div class="input-group date d-flex">
				                                        <div class="input-group-addon" style="width: 38px;">
				                                            <i class="fa fa-calendar"></i>
				                                        </div>
				                                        <input type="text" class="form-control pull-right date-form" name="fechahastadeten" id="dp-fechahasta-reepro" data-date-start-date="-60d" data-date-end-date="0d"/>
				                                    </div>
				                                </div>
											</div>  
				                     </div>
		                                
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>
                                    <button type="button" class="btn btn-primary" id="btn-execute-reeprocesar-n8">Reprocesar</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               
               
               <div class="modal fade" id="modal-configurar-sla">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">x</span></button>
                                    <h4 class="modal-title">Configurar SLAs</h4>
                                </div>
                                <div class="modal-body">
                                     <div id="sla-mensaje"></div>
                                     <div>
			                                <table id="tb-configurar-sla" class="table table-striped table-bordered" role="grid" aria-describedby="tb-configurar-sla">
			                                    <thead>
			                                        <tr role="row">
			                                            <th  style="text-align: center;" tabindex="0" rowspan="1" colspan="1">Entidad</th>
			                                            <th  style="text-align: center;" tabindex="1" rowspan="1" colspan="1">SLA1</th>
			                                            <th  style="text-align: center;" tabindex="2" rowspan="1" colspan="1">SLA2</th>
			                                            <th  style="text-align: center;" tabindex="3" rowspan="1" colspan="1">SLA3</th>                                            
			                                            <th  style="text-align: center;" tabindex="4" rowspan="1" colspan="1">SLA4</th>                                            
			                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1">SLA5</th>
			                                            
			                                            <th  style="text-align: center;" tabindex="5" rowspan="1" colspan="1"></th>
			                                             
			                                        </tr>
			                                    </thead>
			                                    <tbody>
			                                    </tbody>
			                                </table>
			                            </div>
                                    <div  style="margin-top: 15px;">
	                                    <ul>
	                                    	<li>SA1: Acuerdo de Tiempo disponibilidad de una transmision de salida (en minutos)</li>
	                                    	<li>SA2: Acuerdo de Tiempo confirmacion de una transmision de salida (en minutos)</li>
	                                    	<li>SA3: Acuerdo de Tiempo procesamiento de una transmision de entrada (en minutos)</li>
	                                    	<li>SA4: Acuerdo de Frecuencia de lectura (en minutos)</li>
	                                    	<li>SA5: Periodo de calculo para la Frecuencia de lectura (en minutos)</li>
	                                    	
	                                    </ul>
                                    </div>
                                    
                                    
		                            
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
               </div>
               
			  <div class="modal fade" id="modal-xml">
                      <div class="modal-dialog modal-lg">
                          <div class="modal-content">
                              <div class="modal-header">
                                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                      <span aria-hidden="true">x</span></button>
                                  <h4 class="modal-title">Mensaje XML</h4>
                              </div>
                              <div class="modal-body">
                                  <form>
                                      <textarea id="code" name="code"></textarea>
                                  </form>
                              </div>
                              <div class="modal-footer">
                                  <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>                                           
                              </div>
                          </div>
                          <!-- /.modal-content -->
                      </div>
                      <!-- /.modal-dialog -->
                  </div>
                  
                  
                 <div class="modal fade" id="modal-error">
                      <div class="modal-dialog modal-lg">
                          <div class="modal-content">
                              <div class="modal-header">
                                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                      <span aria-hidden="true">x</span></button>
                                  <h4 class="modal-title">Mensaje de Error</h4>
                              </div>
                              <div class="modal-body">
                                  <form>
                                      <textarea id="codeError" name="codeError"></textarea>
                                  </form>
                              </div>
                              <div class="modal-footer">
                                  <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cerrar</button>                                           
                              </div>
                          </div>
                          <!-- /.modal-content -->
                      </div>
                      <!-- /.modal-dialog -->
                  </div>  
	


		</section>
