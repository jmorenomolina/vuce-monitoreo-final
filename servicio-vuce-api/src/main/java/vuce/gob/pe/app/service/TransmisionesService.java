package vuce.gob.pe.app.service;

import java.util.Date;
import java.util.List;

import vuce.gob.pe.app.dto.AlertaTipoIncidenteDTO;
import vuce.gob.pe.app.dto.ConfiguracionMonitoreoDTO;
import vuce.gob.pe.app.dto.DetalleAlertaIncidente6DTO;
import vuce.gob.pe.app.dto.MensajeSalidaDTO;
import vuce.gob.pe.app.dto.RequestFiltrarTransmisionesDTO;
import vuce.gob.pe.app.dto.TrasmisionDTO;
import vuce.gob.pe.app.dto.TrasmisionIncidenteDTO;
import vuce.gob.pe.app.model.FrecuenciaLectura;
import vuce.gob.pe.app.util.RestAppException;

/**
 *
 * @author cquevedo
 */
public interface TransmisionesService {
    
    public List<TrasmisionIncidenteDTO> obtenerTransmisionesConIncidente(Date fechaInicio,Date fechaFin) throws RestAppException;
    
    public List<ConfiguracionMonitoreoDTO> obtenerConfiguracionMonitoreo(Integer entidadId) throws RestAppException;
     
    public List<TrasmisionDTO> filtrarTransmisiones(RequestFiltrarTransmisionesDTO request)  throws RestAppException;
    
    public MensajeSalidaDTO reenviarTransaccionSalidaConError(Integer vcId,String vcTransaccion,Integer veId, String veTransaccion)  throws RestAppException; 
    
    public MensajeSalidaDTO habilitarTransmision(Integer veId)  throws RestAppException;    
    
    public MensajeSalidaDTO reprocesarTransaccionEntradaConError(Integer vcId,String vcTransaccion,Integer veId,String veTransaccion)  throws RestAppException;
    
    public MensajeSalidaDTO anularTransaccionEntradaConError(Integer veId, String veTransaccion,Integer vcId,String vcTransaccion)  throws RestAppException;
        
    public MensajeSalidaDTO reporcesarTransaccionEntradaN8ConError(Integer entidadId,Date fechaInicio,Date fechaFin)  throws RestAppException;
    
    public void actualizarConfiguracionMonitoreo(Integer entidadId,String correoSoporte,String slaNombre, Integer slaValor,String estado)  throws RestAppException;
    
    public MensajeSalidaDTO detenerTrasmision(Integer entidadId,Date fechaInicio,Date fechaFin)  throws RestAppException;   
    
    public DetalleAlertaIncidente6DTO obtenerDetalleAlertaIncidente6(Integer entidadId)  throws RestAppException;   
    
    public AlertaTipoIncidenteDTO obtenerDetalleAlertaTipoIncidente(Integer entidadId,Integer tipoIncidente) throws RestAppException;
}
