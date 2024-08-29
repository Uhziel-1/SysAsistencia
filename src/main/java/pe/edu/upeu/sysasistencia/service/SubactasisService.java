package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.model.Subactasis;

import java.util.List;

public interface SubactasisService {
    public List<Subactasis> obtenerListaSubactasis();
    public Subactasis obtenerSubactasis(Long id);
    public void guardarSubactasis(Subactasis subactasis);
    public void eliminarSubactasis(Long id);
    public void actualizarSubactasis(Subactasis subactasis, Long id);
}
