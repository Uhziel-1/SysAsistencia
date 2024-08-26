package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
