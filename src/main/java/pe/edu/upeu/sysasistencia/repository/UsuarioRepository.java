package pe.edu.upeu.sysasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
