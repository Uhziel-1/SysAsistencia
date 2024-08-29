package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.EventoInscripcion;
import pe.edu.upeu.sysasistencia.repository.EventoInscripcionRepository;
import pe.edu.upeu.sysasistencia.service.EventoInscripcionService;

import java.util.List;

@Service
public class EventoInscripcionServiceImp implements EventoInscripcionService {

    @Autowired
    EventoInscripcionRepository eventoInscripcionRepository;

    @Override
    public List<EventoInscripcion> obtenerEventoInscripcions() {
        return eventoInscripcionRepository.findAll();
    }

    @Override
    public EventoInscripcion obtenerEventoInscripcion(Long id) {
        return eventoInscripcionRepository.findById(id).orElse(new EventoInscripcion());
    }

    @Override
    public void guardarEventoInscripcion(EventoInscripcion eventoInscripcion) {
        eventoInscripcionRepository.save(eventoInscripcion);
    }

    @Override
    public void eliminarEventoInscripcion(Long id) {
        eventoInscripcionRepository.deleteById(id);
    }

    @Override
    public void actualizaEventoInscripcion(EventoInscripcion eventoInscripcion, Long id) {
        eventoInscripcionRepository.save(eventoInscripcion);
    }
}
