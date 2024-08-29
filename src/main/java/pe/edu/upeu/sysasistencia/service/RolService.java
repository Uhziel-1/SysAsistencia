package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Rol;

import java.util.List;

public interface RolService {
    public List<Rol> obtenerRoles();
    public Rol obtenerRol(Long id);
    public void guardarRol(Rol rol);
    public void eliminarRol(Long id);
    public void actualizarRol(Rol rol, Long id);
}
