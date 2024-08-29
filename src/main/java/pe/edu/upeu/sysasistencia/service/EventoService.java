package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Evento;

import java.util.List;

public interface EventoService {
    public List<Evento> obtenerEventos();
    public Evento obtenerEvento(Long id);
    public void guardarEvento(Evento evento);
    public void eliminarEvento(Long id);
    public void actualizarEvento(Evento evento, Long id);
}