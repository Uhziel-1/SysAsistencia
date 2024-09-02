package pe.edu.upeu.sysasistencia.repository;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysasistencia.model.Periodo;

@Repository
public interface PeriodoRepository extends CrudGenericoRepository<Periodo, Long> {
}
