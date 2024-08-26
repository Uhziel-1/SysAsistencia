package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysasistencia.model.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long> {
}
