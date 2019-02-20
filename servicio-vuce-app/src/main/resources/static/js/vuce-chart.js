var chart={
	transmisionesConIncidencia : function(labelsParam,dataEntrada,dataSalida){
		util.resetCanvas("transmisiones-incidentes-entidad");
		var barChartData = {
				labels : labelsParam,
				datasets : [ {
					label : 'Salida',
					backgroundColor : 'rgb(255, 99, 132)',
					data : dataSalida
				}, {
					label : 'Entrada',
					backgroundColor : 'rgb(75, 192, 192)',
					data : dataEntrada
				} ]
			};		
		
		var ctx = document.getElementById('transmisiones-incidentes-entidad').getContext('2d');
		window.myBar = new Chart(ctx,
			{
				type : 'bar',
				data : barChartData,
				options : {
					title : {
						display : true,
						text : 'Total de transmisiones con incidentes por entidad'
					},
					tooltips : {
						mode : 'index',
						intersect : false
					},
					responsive : true,
					scales : {
						xAxes : [ {
							stacked : true,
						} ],
						yAxes : [ {
							stacked : true
						} ]
					}
				}
			});
	}			
}


var table={
		 optionTable : function(){
			var option = {    
					dom: 'Bfrtip',
			        buttons: [
			        	{   extend: 'csv',
	                        className: 'btn btn-primary',
	                        title: 'Exportar CSV',
	                        text: 'Exportar CSV',	 
	                        exportOptions: {
	                            columns: [0,3,4,5,6,7,8,10,11,12,13,14 ]
	                        }
	                    },
	                    {   extend: 'pdfHtml5',
	                    	orientation: 'landscape',
	                        pageSize: 'LEGAL',
	                        className: 'btn btn-primary',
	                        title: 'Reporte de Transmisiones',
	                        text: 'Exportar PDF',	  
	                        exportOptions: {
	                        	columns: [0,3,4,5,6,7,8,10,11,12,13,14 ]
	                         
	                        }
	                    },
			        	
			        ],
			        
		        	'lengthChange': false,
		            'searching': true,
		            'ordering': true,
		            'info': true,
		            'autoWidth': false,
		            "scrollX": true,
		            "scrollY":  '35vh',
		            "scrollCollapse": true,
		            
		            'language': {
		                'lengthMenu': "Mostrar _MENU_ registros por pagina",
		                'zeroRecords': "No encontrado.",
		                'info': "Total de Tx: _MAX_        	|       Mostrar pagina _PAGE_ de _PAGES_ ",
		                'infoEmpty': " ",
		                'infoFiltered': "(filtered from _MAX_ total records)",
		                "paginate": {
		                    "previous": "Anterior",
		                     "next": "Siguiente"	
		                  }
		            }
		        };
			return option; 
		 },
	   	 create: function (idTable,salida) {
	   		 var option = table.optionTable();
	   		 
	   		 if(salida){
	   			option.buttons[1].title = "Reporte de Transmisiones Salida";
	   			tableSalida = $('#'+idTable).DataTable(option);
	   		 }else{
	   			option.buttons[1].title = "Reporte de Transmisiones Entrada";
	   			tableEntrada = $('#'+idTable).DataTable(option);
	   		 }
	   	
	   	 },
	   	 createSimpleTable: function (idTable) {
	   		 $('#'+idTable).DataTable({        
	            "pageLength": 25,
	            'paging': false,
	            'lengthChange': false,
	            'searching': false,
	            'ordering': false,
	            'info': false,
	            'autoWidth': false,
	            "scrollX": false,
	            'language': {
	                'lengthMenu': "Mostrar _MENU_ registros por pagina",
	                'zeroRecords': "No encontrado.",
	                'info': "Total de Tx: _MAX_        	|       Mostrar pagina _PAGE_ de _PAGES_ ",
	                'infoEmpty': " ",
	                'infoFiltered': "(filtered from _MAX_ total records)",
	                "paginate": {
	                    "previous": "Anterior",
	                     "next": "Siguiente"	
	                  }
	            }
	         });	   	
		   	
		 },
		 update : function(idTable,dataSet){
		    $('#'+idTable).dataTable().fnClearTable();
		    $('#'+idTable).dataTable().fnAddData(dataSet); 
		    util.setTamanoTableSalida();		
		 },
		 cleanTable : function(idTable){
		     $('#'+idTable).dataTable().fnClearTable();      
		 }
}

/*var resetCanvas = function (canvasId) {
    $('#' + canvasId).prev().remove();
    $('#' + canvasId).remove();
    $('#parent-' + canvasId).html('<canvas id="' + canvasId + '"></canvas>');
};


var graphic = {
    createBar: function (canvasId, entidades, resultados, title) {
        resetCanvas(canvasId);
        var ctxBar = document.getElementById(canvasId).getContext('2d');
        var myChart = new Chart(ctxBar, {
            type: 'bar',
            data: {
                labels: entidades,
                datasets: [{
                        label: title,
                        data: resultados,
                        backgroundColor: [
                            'rgba(255, 99, 132, 0.7)',
                            'rgba(54, 162, 235, 0.7)',
                            'rgba(255, 206, 86, 0.7)',
                            'rgba(75, 192, 192, 0.7)',
                            'rgba(153, 102, 255, 0.7)',
                            'rgba(255, 159, 64, 0.7)'
                        ],
                        borderColor: [
                            'rgba(255,99,132,1)',
                            'rgba(54, 162, 235, 1)',
                            'rgba(255, 206, 86, 1)',
                            'rgba(75, 192, 192, 1)',
                            'rgba(153, 102, 255, 1)',
                            'rgba(255, 159, 64, 1)'
                        ],
                        borderWidth: 0
                    }]
            },
            options: {
                legend: {
                    display: true,
                    labels: {
                        fontColor: 'rgb(0, 0, 0)'
                    }
                },

                responsive: true,

                scales: {

                    xAxes: [{
                            display: true,
                            scaleLabel: {
                                display: true,
                                labelString: 'Entidad'
                            }

                        }],
                    yAxes: [{
                            display: true,
                            scaleLabel: {
                                display: true,
                                labelString: 'Incidentes'
                            },
                            ticks: {
                                beginAtZero: true
                            }
                        }]
                }
            }
        });
    },
    createLine: function (canvasId,fechas, datasetsParam,Ytitle) {
        resetCanvas(canvasId);
 
        var ctxBar = document.getElementById(canvasId).getContext('2d');
        var myChartLine = new Chart(ctxBar, {
            type: 'line',
            data: {
                labels: fechas,
                datasets: datasetsParam                
            },
            options: {
                legend: {
                    display: true,
                    labels: {
                        fontColor: 'rgb(0, 0, 0)'
                    }
                },
                responsive: true,
                scales: {
                    xAxes: [{
                            display: true,
                            scaleLabel: {
                                display: true,
                                labelString: 'Hora'
                            }
                        }],
                    yAxes: [{
                            display: true,
                            scaleLabel: {
                                display: true,
                                labelString: Ytitle
                            },
                            ticks: {
                                beginAtZero: true
                            }
                        }]
                }
            }
        });
    },
    createTable: function (idTable,dataSet,pagingParam) {     
        console.log("create table...");
        $('#'+idTable).DataTable({        
            "pageLength": 10,
             data: dataSet,
            'paging': pagingParam,
            'lengthChange': false,
            'searching': false,
            'ordering': true,
            'info': true,
            'autoWidth': false,
            "scrollX": true,
            'language': {
                'lengthMenu': "Mostrar _MENU_ registros por pagina",
                'zeroRecords': "No encontrado.",
                'info': "Mostrar pagina _PAGE_ de _PAGES_",
                'infoEmpty': "Registros no disponibles",
                'infoFiltered': "(filtered from _MAX_ total records)"
            }
        });
    },
    createSimpleTable: function (idTable,dataSet) {            
        $('#'+idTable).DataTable({        
            "pageLength": 10,
            'paging': false,
             data: dataSet,
            'lengthChange': false,
            'searching': false,
            'ordering': false,
            'info': false,
            'autoWidth': false,
            "scrollX": false            
        });
    },
    updateTable : function(idTable,dataSet){
        $('#'+idTable).dataTable().fnClearTable();
        $('#'+idTable).dataTable().fnAddData(dataSet);        
    },
    cleanTable : function(idTable){
        $('#'+idTable).dataTable().fnClearTable();      
    }
    

};
*/