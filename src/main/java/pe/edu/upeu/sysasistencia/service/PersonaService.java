package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> obtenerPersonas();
    public Persona obtenerPersona(Long id);
    public void guardarPersona(Persona persona);
    public void eliminarPersona(Long id);
    public void actualizarPersona(Persona persona, Long id);
}
