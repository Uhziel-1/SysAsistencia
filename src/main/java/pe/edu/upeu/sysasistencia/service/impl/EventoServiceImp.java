package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Evento;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.EventoRepository;
import pe.edu.upeu.sysasistencia.service.EventoService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServiceImp extends CrudGenericoServiceImp<Evento, Long> implements EventoService {

    private final EventoRepository eventoRepository;

    @Override
    protected CrudGenericoRepository<Evento, Long> getRepo() {
        return eventoRepository;
    }

    /*
    @Autowired
    EventoRepository eventoRepository;

    @Override
    public List<Evento> obtenerEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento obtenerEvento(Long id) {
        return eventoRepository.findById(id).orElse(new Evento());
    }

    @Override
    public void guardarEvento(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public void eliminarEvento(Long id) {
        eventoRepository.deleteById(id);
    }

    @Override
    public void actualizarEvento(Evento evento, Long id) {
        eventoRepository.save(evento);
    }
     */
}
