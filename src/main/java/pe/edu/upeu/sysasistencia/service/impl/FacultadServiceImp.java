package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Facultad;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.FacultadRepository;
import pe.edu.upeu.sysasistencia.service.FacultadService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FacultadServiceImp extends CrudGenericoServiceImp<Facultad, Long> implements FacultadService {

    private final FacultadRepository facultadRepository;

    @Override
    protected CrudGenericoRepository<Facultad, Long> getRepo() {
        return facultadRepository;
    }

    /*
    @Autowired
    FacultadRepository facultadRepository;

    @Override
    public List<Facultad> obtenerFacultades() {
        return facultadRepository.findAll();
    }

    @Override
    public Facultad obtenerFacultad(Long id) {
        return facultadRepository.findById(id).orElse(new Facultad());
    }

    @Override
    public void guardarFacultad(Facultad facultad) {
        facultadRepository.save(facultad);
    }

    @Override
    public void eliminarFacultad(Long id) {
        facultadRepository.deleteById(id);
    }

    @Override
    public void actualizarFacultad(Facultad facultad, Long id) {
        facultadRepository.save(facultad);
    }
     */
}
