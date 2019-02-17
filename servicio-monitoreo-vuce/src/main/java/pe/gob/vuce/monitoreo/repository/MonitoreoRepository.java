package pe.gob.vuce.monitoreo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.vuce.monitoreo.entity.Operacion;

@Repository
public interface MonitoreoRepository extends JpaRepository<Operacion, Long>{
}