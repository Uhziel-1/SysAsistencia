package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.EventoInscripcion;

public interface EventoInscripcionRepository extends JpaRepository<EventoInscripcion, Long> {
}
