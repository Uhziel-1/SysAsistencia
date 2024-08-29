package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Acceso;

import java.util.List;

public interface AccesoService {
    public List<Acceso> obtenerAccesos();
    public Acceso obtenerAcceso(Long id);
    public void guardarAcceso(Acceso acceso);
    public void eliminarAcceso(Long id);
    public void actualizarAcceso(Acceso acceso, Long id);
}
