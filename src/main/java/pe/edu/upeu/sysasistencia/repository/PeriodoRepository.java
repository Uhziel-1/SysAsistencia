package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysasistencia.model.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}
