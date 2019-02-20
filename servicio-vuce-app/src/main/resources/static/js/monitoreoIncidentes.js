var contextApi = "http://localhost:9000/api";
var editor = "";
var editorError = "";

var xmlTransacciones = [];                           
var ebXmlTransacciones = [];    
var xmlNotificaciones = [];                           

		var dateOption ={
				 autoclose: true,
		         format: 'dd/mm/yyyy'
		};

        $(document).ready(function () {  
        	
        	api.callEntidades();
        	api.callTipoMensajes();
        	api.callTipoDocumentos();
        	api.callTipoTransmision();
        	api.callTipoIncidente();
        	api.callEstadoVuceCentral();
        	api.callEstadoVuceEntidad();        	
        	
            var timeInterval = api.callIntervalo();      
        	
            
            api.callMinFecha();
          
            
            $('#dp-fechahasta-tra-inc').datepicker(dateOption).on('changeDate',function(e){
            	if(util.validateDate('dp-fechadesde-tra-inc','dp-fechahasta-tra-inc')){
            		api.callTransmisionesConIncidentes();
            	}else{
            		alert("La fecha Hasta debe ser mayor a la fecha Desde");
            	}
            });
            
     
            $('#dp-fechahasta-tra').datepicker(dateOption).on('changeDate',function(e){
            	if(!util.validateDate('dp-fechadesde-tra','dp-fechahasta-tra')){
            		alert("La fecha Hasta debe ser mayor a la fecha Desde");
            	}
            });
            
            
            
            $('#dp-fechadesde-det').datepicker(dateOption); 
            $('#dp-fechahasta-det').datepicker(dateOption);
            $('#dp-fechadesde-reepro').datepicker(dateOption);   
            $('#dp-fechahasta-reepro').datepicker(dateOption);
            
            $("#dp-fechadesde-tra-inc").val(util.getDate());
            $("#dp-fechahasta-tra-inc").val(util.getDate());
            $("#dp-fechadesde-tra").val(util.getDate());
            $("#dp-fechahasta-tra").val(util.getDate());
            
            $("#dp-fechadesde-det").val(util.getDate());
            $("#dp-fechahasta-det").val(util.getDate());
            
            $('#dp-fechadesde-reepro').val(util.getDate());  
            $('#dp-fechahasta-reepro').val(util.getDate());
            
            
            
            document.getElementById("btn-filtrar-transmisiones").onclick = function () {
            	api.callTransmisiones();
            };
            document.getElementById("btn-restablecer-fitro").onclick = function () {
            	util.resetPanelFiltro();
            };
            document.getElementById("btn-execute-reenviar-transmisiones").onclick = function () {
            	api.handleTransmisionesSalidaConError();           	
            	api.callTransmisiones();
            };
            
            document.getElementById("btn-execute-habilitar-transmisiones").onclick = function () {
            	api.handleTransmisionHabilitar();
            	api.callTransmisiones();
            };
            
            document.getElementById("btn-execute-reeprocesar-transmisiones").onclick = function () {
            	api.handleTransmisionesReeprocesar();
            	api.callTransmisiones();
            };
            
            document.getElementById("btn-execute-anular-transmisiones").onclick = function () {
            	api.handleTransmisionesAnular();
            	api.callTransmisiones();
            };
            
            document.getElementById("btn-detener-transmisiones").onclick = function () {
            	$('#modal-detener-transmisiones').modal('toggle');	
            };
            
            document.getElementById("btn-reprocesar-n8-con-error").onclick = function () {
            	$('#modal-reeprocesar-n8').modal('toggle');	
            };
            
            
            document.getElementById("btn-reenviar-transmisiones").onclick = function () {
            	var checkboxes = $('input[name="ck-salida"]:checked');
            	if(checkboxes.length>0){
            		$('#modal-reenviar-transmisiones').modal('toggle');	
            	}else{
            		alert("Seleccionar al menos una fila.");
            	}            	
            };
            
            document.getElementById("btn-habilitar-transmisiones").onclick = function () {
            	if(listHabilitarTransmisiones.length>0){
            		$('#modal-habilitar-transmisiones').modal('toggle');	
            	}else{
            		alert("No existen transmisiones para ser habilitadas.");
            	}
            	            	
            };
            
            
            document.getElementById("btn-execute-detener").onclick = function () {     
            	var r = confirm("Se detendran todas las transmisiones de la entidad seleccionada en el perodo indicado");
            	if (r == true) {
            		api.callTransmisionDetener($('#entidades-detener').val(),$('#dp-fechadesde-det').val(),$('#dp-fechahasta-det').val());
            	}            	            	
            };
            
            document.getElementById("btn-execute-reeprocesar-n8").onclick = function () {     
            	var r = confirm("Se reeprocesaran todas las transmisiones N8 de la entidad seleccionada en el período indicado");
            	if (r == true) {
            		api.callTransmisionReeprocesarN8($('#entidades-reeprocesar-n8').val(),$('#dp-fechadesde-reepro').val(),$('#dp-fechahasta-reepro').val());
            	}            	            	
            };
           
            
            document.getElementById("btn-reeprocesar-transmision").onclick = function () {
            	var checkboxes = $('input[name="ck-entrada"]:checked');
            	if(checkboxes.length>0){
            		$('#modal-reprocesar-transmisiones').modal('toggle');	
            	}else{
            		alert("Seleccionar al menos una fila.");
            	}            	
            };
            
            document.getElementById("btn-anular-transmision").onclick = function () {
            	var checkboxes = $('input[name="ck-entrada"]:checked');
            	if(checkboxes.length>0){
            		$('#modal-anular-transmisiones').modal('toggle');	
            	}else{
            		alert("Seleccionar al menos una fila.");
            	}            	
            };
                        
            
            
                        
            table.create("tb-transmisiones-salida",true);
            table.create("tb-transmisiones-entrada",false);      
            
            table.createSimpleTable("tb-configurar-sla");
            table.createSimpleTable("tb-frecuencia-lectura");
            api.callFrecuenciaLectura();
            
            api.callConfiguracionMonitoreo();
            
            
            $('#ck-transmisiones-salida-error').change(function() {
                var checkboxes = $('input[name="ck-salida"]');
                checkboxes.prop('checked', $(this).is(':checked'));
            });
            
            $('#ck-transmisiones-entrada-error').change(function() {
                var checkboxes = $('input[name="ck-entrada"]');
                checkboxes.prop('checked', $(this).is(':checked'));
            });
        	
            
            editor = CodeMirror.fromTextArea(document.getElementById("code"), {
                mode: "application/xml",
                styleActiveLine: true,
                lineNumbers: true,
                lineWrapping: true
            });
            
            
            editorError = CodeMirror.fromTextArea(document.getElementById("codeError"), {             
                styleActiveLine: true,
                lineNumbers: true,
                lineWrapping: true
            });
            
            api.callTransmisionesConIncidentes();    
            
            
            /*setInterval(function(){ 
                       console.log("refresh");
                       api.callTransmisionesConIncidentes();                    
                   }, 5000);*/
            
        	
        	
            /*
            $('#check-transacciones-all').change(function() {
                var checkboxes = $('input[name="transaccion"]');
                checkboxes.prop('checked', $(this).is(':checked'));
            });
            
            $('#check-notificaciones-all').change(function() {
                var checkboxes = $('input[name="notificacion"]');
                checkboxes.prop('checked', $(this).is(':checked'));
            });
  
  
            $('#datepickerDesde').datepicker({
                autoclose: true,
                dateFormat: 'dd/mm/yyyy'
            });
            
            $('#datepickerHasta').datepicker({
                autoclose: true,
                dateFormat: 'dd/mm/yyyy'
            });
   
            
            
            document.getElementById("filtrar-incidentes").onclick = function () {
                action.executeAllReport();
            };
            document.getElementById("btn-renviar-trasmisiones").onclick = function () {
                action.executeReenviarTransacciones();
            };
            
            document.getElementById("btn-anular-notificacion").onclick = function () {
                action.executeAnularNotificacion()();
            };
            
            document.getElementById("btn-reprocesar-notificacion").onclick = function () {
                action.executeReProcesarNotificacion();
            };
            
            $(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
            
            
            action.executeEntidades();
            action.executeTipoMensajes();
            action.executeTransaccionIncidentes();
            action.executeNotificacionIncidentes();
            action.executeTransaccionIncidentesTable(true);
            action.executeNotificacionIncidentesTable(true);
            action.executeFrecuenciaLectura(true);
            
            
            
            editor = CodeMirror.fromTextArea(document.getElementById("code"), {
                mode: "application/xml",
                styleActiveLine: true,
                lineNumbers: true,
                lineWrapping: true
            });
            
            */
            
            /*
             setInterval(function(){ 
                        console.log("refresh");
                        action.executeAllReport();                    
                    }, 30000);*/
            
        });
        
        
        /*
        var action = {
                 
                 getDate: function () {               
                    var today = new Date();
                    var dd = today.getDate();
                    var mm = today.getMonth()+1; //January is 0!
                    var yyyy = today.getFullYear();
                    if(dd<10) {
                        dd = '0'+dd;
                    } 

                    if(mm<10) {
                        mm = '0'+mm;
                    } 

                    return dd + '/' + mm + '/' + yyyy;
               
                },          
                executeAllReport: function () {
                        action.executeTransaccionIncidentes();
                        action.executeNotificacionIncidentes();
                        action.executeTransaccionIncidentesTable(false);
                        action.executeNotificacionIncidentesTable(false);
                        action.executeFrecuenciaLectura(false);
                },
                executeEntidades: function () {
                        $.ajax({
                                url: contextApi + "/entidades",
                                complete: function () {
                                    var selectDemo = $('#entidades');
                                    selectDemo.selectpicker('refresh');
                                 }
                        }).done(function (data) {
                            var $select = $('#entidades');
                            $select.find('option').remove();
                            $select.append('<option value="-1" selected="selected">Todas</option>');
                            $.each(data, function (key, value)
                            {
                                $select.append('<option value=' + value.idEntidad + '>' + value.entidad + '</option>');
                            });
                        });
                },
                executeTipoMensajes: function () {
                        $.ajax({
                                url: contextApi + "/tipomensajes",
                                complete: function () {
                                    var select = $('#tipomensajes');
                                    select.selectpicker('refresh');
                                }
                        }).done(function (data) {
                            var $select = $('#tipomensajes');
                            $select.find('option').remove();
                            $select.append('<option value="-1" selected="selected">Todos</option>');
                            $.each(data, function (key, value)
                            {
                                $select.append('<option value=' + value.codigo + '>' + value.codigo + '</option>');
                            });
                        });
                },
                executeTransaccionIncidentes: function () {
                        $.ajax({
                            url: contextApi + "/reporte/transaccion/incidentes",
                            data: $("#form-search").serialize()
                        }).done(function (data) {
                            
                            
                            var entidades = [];
                            var resultados = [];
                            $.each(data, function (key, value)
                            {
                                entidades.push(value.entidad);
                                resultados.push(value.cantidadIncidentes);
                            });
                            graphic.createBar("transacciones-procesadas", entidades, resultados, "Transacciones");
                        });
                },
                executeNotificacionIncidentes: function () {
                        $.ajax({
                            url: contextApi + "/reporte/notificacion/incidentes",
                            data: $("#form-search").serialize()
                        }).done(function (data) {
                            var entidades = [];
                            var resultados = [];
                            $.each(data, function (key, value)
                            {
                                entidades.push(value.entidad);
                                resultados.push(value.cantidadIncidentes);
                            });
                            graphic.createBar("notificaciones-incidencias", entidades, resultados, "Notificaciones");
                        });
                },
                executeTransaccionIncidentesTable: function (isNew) {
                    $.ajax({
                        url: contextApi + "/reporte/transaccion/con/incidentes",
                        data: $("#form-search").serialize()
                    }).done(function (data, textStatus, xhr) {
                        
                       if(xhr.status===200){                            
                             
                            var dataSet = [];
                            xmlTransacciones = [];
                            ebXmlTransacciones = [];
                            $.each(data, function (key, value)
                            {
                                var row = [];   
                                var rowTransaccionXml = []; 
                                var rowTransaccionEbXml = []; 
                                row.push((value.tipo===3)? "<input type='checkbox' name='transaccion' value='"+value.idTransmision+"'/>":"");                            
                                row.push("<div class='tipo-transacciones-" + value.tipo + "'></div>");
                                row.push(value.entidad);
                                row.push(value.idTransmision);
                                row.push(value.tipoMensaje);
                                row.push(value.tipoDocumento);
                                row.push(value.numeroDocumento);
                                row.push(value.tamanoAdjuntos);
                                row.push(value.fechaCreacion);
                                row.push(value.fechaPrimeraLectura);
                                row.push(value.fechaConfirmacion);
                                row.push(value.antiguedad+ " min");
                                row.push(value.cantidadLecturas);
                                if(value.mensajexml  !== null){
                                  row.push("<a href='javascript:action.showXmlTransaccion("+value.idTransmision+");'>Ver</a>");  
                                  rowTransaccionXml.push(value.idTransmision);
                                  rowTransaccionXml.push(value.mensajexml);
                                  xmlTransacciones.push(rowTransaccionXml);
                                }else{
                                   row.push("");    
                                }    
                                
                                if(value.ebxml  !== null){
                                  row.push("<a href='javascript:action.showEbXmlTransaccion("+value.idTransmision+");'>Ver</a>");  
                                  rowTransaccionEbXml.push(value.idTransmision);
                                  rowTransaccionEbXml.push(value.ebxml);
                                  ebXmlTransacciones.push(rowTransaccionEbXml);
                                }else{
                                   row.push("");    
                                }    
                                dataSet.push(row);
                            });
                            
                            
                            if(isNew){
                                graphic.createTable("tb-transaccion-incidente",dataSet,true); 
                            }else{
                                graphic.updateTable("tb-transaccion-incidente",dataSet);  
                            } 
                            
                        }else{
                               var dataSet = [];
                               graphic.cleanTable("tb-transaccion-incidente");  
                        }
                    
                                                 
                    });
                },
                showXmlTransaccion: function(idTransaccion){
                    for(var i=0;i<xmlTransacciones.length;i++){
                        if(xmlTransacciones[i][0]===idTransaccion){
                           $('#modal-xml').modal('show');
                           setTimeout(function(){  editor.setValue(xmlTransacciones[i][1]); }, 1000);
                           return;
                        }
                    }                    
                },                
                showEbXmlTransaccion: function(idTransaccion){
                    for(var i=0;i<ebXmlTransacciones.length;i++){
                        if(ebXmlTransacciones[i][0]===idTransaccion){
                           $('#modal-xml').modal('show');
                           setTimeout(function(){  editor.setValue(ebXmlTransacciones[i][1]); }, 1000);
                           return;
                        }
                    }                    
                },                
                executeReenviarTransacciones: function(){  
                    
                    
                    $.ajax({
                        url: contextApi + "/reporte/transaccion/reenviar",
                        data: $('input[name="transaccion"]:checked').serialize()
                    }).done(function (data) {
                        
                       
                        var dataSet = [];
                        $.each(data, function (key, value)
                        {
                            var row = []; 
                            row.push(value.idTransmision);
                            row.push(value.resultado);
                            dataSet.push(row);
                        });
                        action.executeTransaccionIncidentesTable(false);    
                        
                        $('#modal-reenviar-transacciones').modal('toggle');
                        
                        $('#modal-reenviar-transacciones-response').modal('toggle');  
                        
                        
                        if ( !$.fn.DataTable.isDataTable( '#tb-respuesta-transaccion' ) ) {
                            graphic.createSimpleTable("tb-respuesta-transaccion",dataSet,false); 
                        }else{
                            graphic.updateTable("tb-respuesta-transaccion",dataSet);   
                        }                        
                                             
                    }).always(function() {
                       
                    });                   
                },
                executeAnularNotificacion: function(){                                        
                    $.ajax({
                        url: contextApi + "/reporte/notificacion/anular",
                        data: $('input[name="notificacion"]:checked').serialize()
                    }).done(function (data) {
                        var dataSet = [];
                        $.each(data, function (key, value)
                        {
                            var row = []; 
                            row.push(value.vcId);
                            row.push(value.resultado);
                            dataSet.push(row);
                        });
                        action.executeNotificacionIncidentesTable(false);    
                        
                        $("#span-text").html("Anular");
                        $('#modal-anular-notificacion').modal('toggle');
                        $('#modal-notificacion-response').modal('toggle');    
                           
                        if ( !$.fn.DataTable.isDataTable( '#tb-respuesta-notificacion' ) ) {
                            graphic.createSimpleTable("tb-respuesta-notificacion",dataSet); 
                        }else{
                            graphic.updateTable("tb-respuesta-notificacion",dataSet);   
                        }                        
                                         
                    });                    
                },
                executeReProcesarNotificacion: function(){                                        
                    $.ajax({
                        url: contextApi + "/reporte/notificacion/reprocesar",
                        data: $('input[name="notificacion"]:checked').serialize()
                    }).done(function (data) {
                        var dataSet = [];
                        $.each(data, function (key, value)
                        {
                            var row = []; 
                            row.push(value.vcId);
                            row.push(value.resultado);
                            dataSet.push(row);
                        });
                        action.executeNotificacionIncidentesTable(false);    
                   
                        $('#modal-reprocesar-notificacion').modal('toggle');
                        
                        if ( !$.fn.DataTable.isDataTable( '#tb-respuesta-notificacion' ) ) {
                            graphic.createTable("tb-respuesta-notificacion",dataSet,false); 
                        }else{
                            graphic.updateTable("tb-respuesta-notificacion",dataSet,false);   
                        }                        
                        $('#modal-notificacion-response').modal('toggle');                        
                    });                    
                },
                executeNotificacionIncidentesTable: function (isNew) {
                    $.ajax({
                        url: contextApi + "/reporte/notificacion/con/incidentes",
                        data: $("#form-search").serialize()
                    }).done(function (data, textStatus, xhr) {
                        if(xhr.status===200){    
                          var dataSet = [];
                          xmlNotificaciones = [];
                          
                            $.each(data, function (key, value)
                            {                                
                                var row = [];  
                                var rowNotificacionXml = [];                                  
                                row.push((value.tipo===2)? "<input type='checkbox' name='notificacion' value='"+value.vcId+"' />":"");                            
                                row.push("<div class='tipo-transacciones-" + value.tipo + "'></div>");
                                row.push(value.entidad);
                                row.push(value.veId);
                                row.push(value.vcId);
                                row.push(value.tipoMensaje);
                                row.push(value.tipoDocumento);
                                row.push(value.numeroDocumento);
                                row.push(value.fechaRecepcion);
                                row.push(value.fechaProcesamiento);                              
                                row.push(value.antiguedad + " min");                                 
                                if(value.ebxml  !== null){
                                  row.push("<a href='javascript:action.showXmlNotificacion("+value.idTransmision+");'>Ver</a>");  
                                  rowNotificacionXml.push(value.idTransmision);
                                  rowNotificacionXml.push(value.xml);
                                  xmlNotificaciones.push(rowNotificacionXml);
                                }else{
                                   row.push("");    
                                }    
                                dataSet.push(row);
                                                             
                            });
                            if(isNew){
                                graphic.createTable("tb-notificacion-incidente",dataSet,true); 
                            }else{
                                graphic.updateTable("tb-notificacion-incidente",dataSet,true);  
                            }
                        }else{
                            graphic.cleanTable("tb-notificacion-incidente");
                        }
                        
                           
                    });
                },
                executeFrecuenciaLectura: function (isNew) {
                    $.ajax({
                        url: contextApi + "/reporte/frecuencia/lectura",
                        data: $("#form-search").serialize()
                    }).done(function (data) {
                        var dataSet = [];
                        $.each(data, function (key, value)
                        {
                            var row = [];
                            row.push(value.entidad);   
                            row.push("<div class='tipo-frecuencia-" + value.enMantenimiento + "'></div>");
                            row.push(value.frecuenciaLecturaEsperada +" min");   
                            row.push(value.frecuenciaLecturaActual+" min");   
                            row.push("<div class='tipo-frecuencia-cumplimiento-" + value.cumpleFrecuenciaLectura + "'></div>");                        
                            dataSet.push(row);
                        });
                        if(isNew){
                            graphic.createTable("tb-frecuencia-transacciones",dataSet,true); 
                        }else{
                            graphic.updateTable("tb-frecuencia-transacciones",dataSet,true);  
                        }
                           
                    });
                },
                showXmlNotificacion: function(idTransaccion){
                    for(var i=0;i<xmlNotificaciones.length;i++){
                        if(xmlNotificaciones[i][0]===idTransaccion){
                           $('#modal-xml').modal('show');
                           setTimeout(function(){  editor.setValue(xmlNotificaciones[i][1]); }, 1000);
                           return;
                        }
                    }                    
                }
                

        }**/