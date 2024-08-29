package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Materiales;
import pe.edu.upeu.sysasistencia.repository.MaterialesRepository;
import pe.edu.upeu.sysasistencia.service.MaterialesService;

import java.util.List;

@Service
public class MaterialesServiceImp implements MaterialesService {

    @Autowired
    MaterialesRepository materialesRepository;

    @Override
    public List<Materiales> obtenerListaMateriales() {
        return materialesRepository.findAll();
    }

    @Override
    public Materiales obtenerMateriales(Long id) {
        return materialesRepository.findById(id).orElse(new Materiales());
    }

    @Override
    public void guardarMateriales(Materiales materiales) {
        materialesRepository.save(materiales);
    }

    @Override
    public void eliminarMateriales(Long id) {
        materialesRepository.deleteById(id);
    }

    @Override
    public void actualizarMateriales(Materiales materiales, Long id) {
        materialesRepository.save(materiales);
    }
}
