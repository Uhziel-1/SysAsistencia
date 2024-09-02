package pe.edu.upeu.sysasistencia.repository;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysasistencia.model.Acceso;

@Repository
public interface AccesoRepository extends CrudGenericoRepository<Acceso, Long> {
}
