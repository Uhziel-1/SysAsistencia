package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.EventoInscripcion;

import java.util.List;

public interface EventoInscripcionService {
    public List<EventoInscripcion> obtenerEventoInscripcions();
    public EventoInscripcion obtenerEventoInscripcion(Long id);
    public void guardarEventoInscripcion(EventoInscripcion eventoInscripcion);
    public void eliminarEventoInscripcion(Long id);
    public void actualizaEventoInscripcion(EventoInscripcion eventoInscripcion, Long id);
}
