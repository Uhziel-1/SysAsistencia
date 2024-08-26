package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
