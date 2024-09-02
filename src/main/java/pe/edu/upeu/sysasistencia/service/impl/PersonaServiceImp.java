package pe.edu.upeu.sysasistencia.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Periodo;
import pe.edu.upeu.sysasistencia.model.Persona;
import pe.edu.upeu.sysasistencia.repository.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repository.PersonaRepository;
import pe.edu.upeu.sysasistencia.service.PeriodoService;
import pe.edu.upeu.sysasistencia.service.PersonaService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonaServiceImp extends CrudGenericoServiceImp<Persona, Long> implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    protected CrudGenericoRepository<Persona, Long> getRepo() {
        return personaRepository;
    }

    /*
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPersona(Long id) {
        return personaRepository.findById(id).orElse(new Persona());
    }

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void actualizarPersona(Persona persona, Long id) {
        personaRepository.save(persona);
    }
     */
}
