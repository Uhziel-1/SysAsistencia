package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Escuela;
import pe.edu.upeu.sysasistencia.repository.EscuelaRepository;
import pe.edu.upeu.sysasistencia.service.EscuelaService;

import java.util.List;

@Service
public class EscuelaServiceImp implements EscuelaService {

    @Autowired
    EscuelaRepository escuelaRepository;

    @Override
    public List<Escuela> obtenerEscuelas() {
        return escuelaRepository.findAll();
    }

    @Override
    public Escuela obtenerEscuela(Long id) {
        return escuelaRepository.findById(id).orElse(new Escuela());
    }

    @Override
    public void guardarEscuela(Escuela escuela) {
        escuelaRepository.save(escuela);
    }

    @Override
    public void eliminarEscuela(Long id) {
        escuelaRepository.deleteById(id);
    }

    @Override
    public void actualizarEscuela(Escuela escuela, Long id) {
        escuelaRepository.save(escuela);
    }
}
