package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Periodo;
import pe.edu.upeu.sysasistencia.repository.PeriodoRepository;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;

@Service
public class PeriodoServiceImp implements PeriodoService {

    @Autowired
    PeriodoRepository periodoRepository;

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
}
