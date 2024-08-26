package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Facultad;

import java.util.List;

public interface FacultadRepository extends JpaRepository<Facultad, Long> {
}
