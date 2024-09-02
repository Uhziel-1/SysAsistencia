package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Asistencia;
import pe.edu.upeu.sysasistencia.repository.AsistenciaRepository;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.service.AsistenciaService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AsistenciaServiceImp extends CrudGenericoServiceImp<Asistencia, Long> implements AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    @Override
    protected CrudGenericoRepository<Asistencia, Long> getRepo() {
        return asistenciaRepository;
    }

    /*
    @Autowired
    AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> obtenerAsistencias() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia obtenerAsistencia(Long id) {
        return asistenciaRepository.findById(id).orElse(new Asistencia());
    }

    @Override
    public void guardarAsistencia(Asistencia asistencia) {
        asistenciaRepository.save(asistencia);
    }

    @Override
    public void eliminarAsistencia(Long id) {
        asistenciaRepository.deleteById(id);
    }

    @Override
    public void actualizarAsistencia(Asistencia asistencia, Long id) {
        asistenciaRepository.save(asistencia);
    }
     */
}
