package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Escuela;

import java.util.List;

public interface EscuelaService {
    public List<Escuela> obtenerEscuelas();
    public Escuela obtenerEscuela(Long id);
    public void guardarEscuela(Escuela escuela);
    public void eliminarEscuela(Long id);
    public void actualizarEscuela(Escuela escuela, Long id);
}
