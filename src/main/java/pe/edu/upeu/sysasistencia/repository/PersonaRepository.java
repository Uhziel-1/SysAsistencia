package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
