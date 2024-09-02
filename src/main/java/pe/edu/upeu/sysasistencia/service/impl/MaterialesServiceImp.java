package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Materiales;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.MaterialesRepository;
import pe.edu.upeu.sysasistencia.service.MaterialesService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MaterialesServiceImp extends CrudGenericoServiceImp<Materiales, Long> implements MaterialesService {

    private final MaterialesRepository materialesRepository;

    @Override
    protected CrudGenericoRepository<Materiales, Long> getRepo() {
        return materialesRepository;
    }

    /*
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
     */
}
