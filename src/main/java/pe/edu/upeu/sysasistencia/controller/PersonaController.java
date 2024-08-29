package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Persona;
import pe.edu.upeu.sysasistencia.service.PersonaService;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/list")
    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> p=personaService.obtenerPersonas();
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Persona> findByAcceso(@PathVariable Long id) {
        Persona p=personaService.obtenerPersona(id);
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("/guardar")
    public void guardar(@RequestBody Persona p) {
        personaService.guardarPersona(p);
    }

    @GetMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        personaService.eliminarPersona(id);
    }
}
