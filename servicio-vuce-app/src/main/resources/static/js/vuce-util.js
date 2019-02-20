 var util = {    
		 validateDate(idFechaDesde,idFechaHasta){
			var fechaDesde = $("#"+idFechaDesde).val();
         	var partsDesde =fechaDesde.split('/');
         	
         	var fechaHasta = $("#"+idFechaHasta).val();
         	var partsHasta =fechaHasta.split('/');
         	
         	var fechaDesdeDate = new Date(partsDesde[2], partsDesde[1], partsDesde[0]); //Year, Month, Date  
            var fechaHastaDate = new Date(partsHasta[2], partsHasta[1], partsHasta[0]); //Year, Month, Date  

            if(fechaHastaDate>=fechaDesdeDate){
              return true;
            }else{
            	 return false;
            }
		 },
		 resetCanvas : function (canvasId) {
			    $('#' + canvasId).prev().remove();
			    $('#' + canvasId).remove();
			    $('#parent-' + canvasId).html('<canvas id="' + canvasId + '"></canvas>');
		 },
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
        setTamanoTableSalida:function(){
        	var cantidad = $("#cantidad-filas-mostrar").val();
        	
        	if (typeof cantidad !== 'undefined'){
        		console.log("definido....");
	        	if(cantidad!==""){
	        	  tableSalida.page.len( cantidad ).draw();        		
	        	}else{
	        	  tableSalida.page.len( 10 ).draw();	
	        	}
        	}
        	
        },
        setTamanoTableEntrada:function(){
        	
        	var cantidad = $("#cantidad-filas-mostrar-entrada").val();
        	if(cantidad!==""){
        	  tableEntrada.page.len( cantidad ).draw();        		
        	}else{
        		tableEntrada.page.len( 10 ).draw();	
        	}
        	
        },
        showXmlNotificacion: function(idTransaccion){
            for(var i=0;i<xmlNotificaciones.length;i++){
                if(xmlNotificaciones[i][0]===idTransaccion){
                   $('#modal-xml').modal('show');
                   setTimeout(function(){  editor.setValue(xmlNotificaciones[i][1]); }, 1000);
                   return;
                }
            }                    
        },
        activateReenviarTransmisionesIncorrectamente: function(activate){
        	$("#ck-transmisiones-salida-error").prop("disabled", !activate); 
        	$("#btn-reenviar-transmisiones").prop("disabled", !activate); 
        },
        activateHabilitarTransmisiones: function(activate){
        	$("#btn-habilitar-transmisiones").prop("disabled", !activate); 
        },
        activateButtonFooter: function(activate){
        	$("#ck-transmisiones-entrada-error").prop("disabled", !activate); 
        	$("#btn-reeprocesar-transmision").prop("disabled", !activate); 
        	$("#btn-anular-transmision").prop("disabled", !activate); 
        },
        resetPanelFiltro:function(){
        	 $("#entidades").val('%');
             $("#entidades").selectpicker("refresh");             
             $("#tipomensajes").val('%');
             $("#tipomensajes").selectpicker("refresh");             
             $("#tipo-documentos").val('%');
             $("#tipo-documentos").selectpicker("refresh");             
             $("#dp-fechadesde-tra").val(util.getDate());
             $("#dp-fechahasta-tra").val(util.getDate());             
             $("#nrodocumento").val("");                          
             $("#tipo-transmision").val("2");
             $("#tipo-transmision").selectpicker("refresh");             
             $("#tipo-incidente").val('%');
             $("#tipo-incidente").selectpicker("refresh");             
             $("#estado-vc-central").val('%');
             $("#estado-vc-central").selectpicker("refresh");             
             $("#estado-vc-entidad").val('%');
             $("#estado-vc-entidad").selectpicker("refresh");             
             $("#vc-id").val("");  
             $("#ve-id").val("");   
             
             //util.activateReenviarTransmisionesIncorrectamente(false);
             
        },
        createRequestFiltro: function(){  
        
        	util.validateRequestCbo("entidades",'%');
        	util.validateRequestCbo("tipomensajes",'%');
        	util.validateRequestCbo("tipo-documentos",'%');        	
        	util.validateRequestCbo("tipo-transmision","1");
        	util.validateRequestCbo("tipo-incidente",'%');
        	util.validateRequestCbo("estado-vc-central",'%');
        	util.validateRequestCbo("estado-vc-entidad",'%');        	
        	
        	var entidades = $("#entidades").val();
        	var tipomensajes = $("#tipomensajes").val();
        	var tipodocumentos = $("#tipo-documentos").val();        	
        	var tipoTransmision = $("#tipo-transmision").val();
        	var tipoIncidente = $("#tipo-incidente").val();
        	var estadoVcCentral = $("#estado-vc-central").val();
        	var estadoVcEntidad = $("#estado-vc-entidad").val();
        	
        	var request ={
    			entidades :   (entidades.length==1 && entidades[0]==="%" ) ? entidades.join("|")  : util.arrayRemove(entidades,"%").join("|"),
    			tipoMensaje : (tipomensajes.length==1 && tipomensajes[0]==="%" ) ? tipomensajes.join("|") : util.arrayRemove(tipomensajes,"%").join("|"),
    			tipoDocumento :(tipodocumentos.length==1 && tipodocumentos[0]==="%" ) ? tipodocumentos.join("|") :  util.arrayRemove(tipodocumentos,"%").join("|"),
    			fechaInicio : $("#dp-fechadesde-tra").val(),
    			fechaFin: $("#dp-fechahasta-tra").val(),
    			numeroDocumento: $("#nrodocumento").val(),    			
    			tipoTransmision :   (tipoTransmision.length==1 && tipoTransmision[0]==="1" ) ? tipoTransmision.join("|")  : util.arrayRemove(tipoTransmision,"1").join("|"),
    			tipoIncidente : (tipoIncidente.length==1 && tipoIncidente[0]==="%" ) ? tipoIncidente.join("|") : util.arrayRemove(tipoIncidente,"%").join("|"),
    			estadoVc : (estadoVcCentral.length==1 && estadoVcCentral[0]==="%" ) ? estadoVcCentral.join("|") :  util.arrayRemove(estadoVcCentral,"%").join("|"),
    			estadoVe : (estadoVcEntidad.length==1 && estadoVcEntidad[0]==="%" ) ? estadoVcEntidad.join("|")  : util.arrayRemove(estadoVcEntidad,"%").join("|"),
    			vcId : $("#vc-id").val(),
    			veId: $("#ve-id").val()	
        	}
        	return request;    
        },
        arrayRemove : function (arr, value) {
    	   return arr.filter(function(ele){
    	       return ele != value;
    	   });

    	},
    	validateRequestCbo:function(id,defaultValue){
    		if($("#"+id).val().length==0){
        		$("#"+id).val(defaultValue);
        		$("#"+id).selectpicker("refresh"); 
        	}    		
    	},
    	showXmlSalida: function(id){
             for(var i=0;i<xmlSalida.length;i++){
                 if(xmlSalida[i][0]===id){
                    $('#modal-xml').modal('show');
                    setTimeout(function(){  editor.setValue(xmlSalida[i][1]); }, 1000);
                    return;
                 }
             }                    
         },
         showEbXmlSalida: function(id){
             for(var i=0;i<ebXmlSalida.length;i++){
                 if(ebXmlSalida[i][0]===id){
                    $('#modal-xml').modal('show');
                    setTimeout(function(){  editor.setValue(ebXmlSalida[i][1]); }, 1000);
                    return;
                 }
             }                    
         },
     	showXmlEntrada: function(id){
            for(var i=0;i<xmlEntrada.length;i++){
                if(xmlEntrada[i][0]===id){
                   $('#modal-xml').modal('show');
                   setTimeout(function(){  editor.setValue(xmlEntrada[i][1]); }, 1000);
                   return;
                }
            }                    
        },
        showEbXmlEntrada: function(id){
            for(var i=0;i<ebXmlEntrada.length;i++){
                if(ebXmlEntrada[i][0]===id){
                   $('#modal-xml').modal('show');
                   setTimeout(function(){  editor.setValue(ebXmlEntrada[i][1]); }, 1000);
                   return;
                }
            }                    
        },
        showErrorSalida: function(id){
            for(var i=0;i<errorSalida.length;i++){
                if(errorSalida[i][0]===id){
                   $('#modal-error').modal('show');
                   setTimeout(function(){  editorError.setValue(errorSalida[i][1]); }, 1000);
                   return;
                }
            }                    
        },
        showErrorEntrada: function(id){
            for(var i=0;i<errorEntrada.length;i++){
                if(errorEntrada[i][0]===id){
                   $('#modal-error').modal('show');
                   setTimeout(function(){  editorError.setValue(errorEntrada[i][1]); }, 1000);
                   return;
                }
            }                    
        }  
}