package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Periodo;
import pe.edu.upeu.sysasistencia.model.Persona;
import pe.edu.upeu.sysasistencia.repository.PersonaRepository;
import pe.edu.upeu.sysasistencia.service.PeriodoService;
import pe.edu.upeu.sysasistencia.service.PersonaService;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {

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
}
