package pe.edu.upeu.sysasistencia.repository;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysasistencia.model.Asistencia;

@Repository
public interface AsistenciaRepository extends CrudGenericoRepository<Asistencia, Long> {
}
