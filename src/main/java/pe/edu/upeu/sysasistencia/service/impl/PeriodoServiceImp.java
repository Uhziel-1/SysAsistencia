package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Periodo;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.PeriodoRepository;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PeriodoServiceImp extends CrudGenericoServiceImp<Periodo, Long> implements PeriodoService {

    private final PeriodoRepository periodoRepository;

    @Override
    protected CrudGenericoRepository<Periodo, Long> getRepo() {
        return periodoRepository;
    }



    /*
    @Override
    public List<Periodo> obtenerPeriodos() {
        return periodoRepository.findAll();
    }

    @Override
    public Periodo obtenerPeriodo(Long id) {
        return periodoRepository.findById(id).orElse(new Periodo());
    }

    @Override
    public void guardarPeriodo(Periodo periodo) {
        periodoRepository.save(periodo);
    }

    @Override
    public void eliminarPeriodo(Long id) {
        periodoRepository.deleteById(id);
    }

    @Override
    public void actualizarPeriodo(Periodo periodo, Long id) {
        periodoRepository.save(periodo);
    }
     */
}
