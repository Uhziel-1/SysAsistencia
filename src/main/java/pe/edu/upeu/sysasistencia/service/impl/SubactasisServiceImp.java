package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Subactasis;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.SubactasisRepository;
import pe.edu.upeu.sysasistencia.service.SubactasisService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SubactasisServiceImp extends CrudGenericoServiceImp<Subactasis, Long> implements SubactasisService {

    private final SubactasisRepository subactasisRepository;

    @Override
    protected CrudGenericoRepository<Subactasis, Long> getRepo() {
        return subactasisRepository;
    }

    /*
    @Autowired
    SubactasisRepository subactasisRepository;

    @Override
    public List<Subactasis> obtenerListaSubactasis() {
        return subactasisRepository.findAll();
    }

    @Override
    public Subactasis obtenerSubactasis(Long id) {
        return subactasisRepository.findById(id).orElse(new Subactasis());
    }

    @Override
    public void guardarSubactasis(Subactasis subactasis) {
        subactasisRepository.save(subactasis);
    }

    @Override
    public void eliminarSubactasis(Long id) {
        subactasisRepository.deleteById(id);
    }

    @Override
    public void actualizarSubactasis(Subactasis subactasis, Long id) {
        subactasisRepository.save(subactasis);
    }
     */
}
