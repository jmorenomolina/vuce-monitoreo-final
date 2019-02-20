var desde= null;
var hasta= null;	
var id= null; 
var id= null; 
var mantenimientoId= null; 

var dateOption ={
		 autoclose: true,
         format: 'dd/mm/yyyy'
};

$(document).ready(function () {  
	 table.createSimpleTable("tb-mantenimiento-entidad");
	 api.callEntidadesMantenimiento();
	 api.callMantenimientoEntidad();
	
	
	 $('#dp-fechadesde-man').datepicker(dateOption); 
     $('#dp-fechahasta-man').datepicker(dateOption);
     
     $("#dp-fechadesde-man").val(util.getDate());
     $("#dp-fechahasta-man").val(util.getDate());
     
     
     document.getElementById("btn-execute-editar-man").onclick = function () {
     	api.callEditarMantenimiento(mantenimientoId,$("#entidades").val(),$("#dp-fechadesde-man").val(),$("#dp-fechahasta-man").val() );
          	
     };
     
     document.getElementById("btn-execute-registrar-man").onclick = function () {
      	api.callRegistarMantenimiento( $("#entidades").val(),$("#dp-fechadesde-man").val(),$("#dp-fechahasta-man").val() );
           	
      };
	    
});


function editarmantenimiento(value){
	desde= $("#row"+value).attr("min");
	hasta= $("#row"+value).attr("max");	
	id= $("#row"+value).attr("entidad");
	mantenimientoId = value;
	
	$("#entidades").val(id);
	$("#entidades").selectpicker('refresh');
	$("#dp-fechadesde-man").val(desde);	
	$("#dp-fechahasta-man").val(hasta);
	
	$("#btn-execute-registrar-man").hide();
    $("#btn-execute-editar-man").show();	
    
    
    
    
}


function limpiar(){

	$("#dp-fechadesde-man").val(util.getDate());	
	$("#dp-fechahasta-man").val(util.getDate());
	
	$("#btn-execute-registrar-man").show();
    $("#btn-execute-editar-man").hide();	
    
}