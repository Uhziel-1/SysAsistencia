package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Rol;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.RolRepository;
import pe.edu.upeu.sysasistencia.service.RolService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RolServiceImp extends CrudGenericoServiceImp<Rol, Long> implements RolService {

    private final RolRepository rolRepository;

    @Override
    protected CrudGenericoRepository<Rol, Long> getRepo() {
        return rolRepository;
    }

    /*
    @Autowired
    RolRepository rolRepository;

    @Override
    public List<Rol> obtenerRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol obtenerRol(Long id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    @Override
    public void guardarRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Long id) {
        rolRepository.deleteById(id);
    }

    @Override
    public void actualizarRol(Rol rol, Long id) {
        rolRepository.save(rol);
    }
     */
}
