package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Acceso;
import pe.edu.upeu.sysasistencia.repository.AccesoRepository;
import pe.edu.upeu.sysasistencia.service.AccesoService;

import java.util.List;

@Service
public class AccesoServiceImp implements AccesoService {

    @Autowired
    AccesoRepository accesoRepository;

    @Override
    public List<Acceso> obtenerAccesos() {
        return accesoRepository.findAll();
    }

    @Override
    public Acceso obtenerAcceso(Long id) {
        return accesoRepository.findById(id).orElse(new Acceso());
    }

    @Override
    public void guardarAcceso(Acceso acceso) {
        accesoRepository.save(acceso);
    }

    @Override
    public void eliminarAcceso(Long id) {
        accesoRepository.deleteById(id);
    }

    @Override
    public void actualizarAcceso(Acceso acceso, Long id) {
        accesoRepository.save(acceso);
    }
}
