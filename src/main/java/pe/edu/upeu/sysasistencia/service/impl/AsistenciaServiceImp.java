package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Asistencia;
import pe.edu.upeu.sysasistencia.repository.AsistenciaRepository;
import pe.edu.upeu.sysasistencia.service.AsistenciaService;

import java.util.List;

@Service
public class AsistenciaServiceImp implements AsistenciaService {

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
}
