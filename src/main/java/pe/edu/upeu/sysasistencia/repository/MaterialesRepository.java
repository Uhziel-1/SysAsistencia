package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Materiales;

import java.util.List;

public interface MaterialesRepository extends JpaRepository<Materiales, Long> {
}
