package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Materiales;

import java.util.List;

public interface MaterialesService {
    public List<Materiales> obtenerListaMateriales();
    public Materiales obtenerMateriales(Long id);
    public void guardarMateriales(Materiales materiales);
    public void eliminarMateriales(Long id);
    public void actualizarMateriales(Materiales materiales, Long id);
}