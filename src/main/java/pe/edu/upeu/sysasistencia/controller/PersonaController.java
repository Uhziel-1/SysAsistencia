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
        List<Persona> p=personaService.findAll();
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Persona> findByAcceso(@PathVariable Long id) {
        Persona p=personaService.findById(id);
        return ResponseEntity.ok().body(p);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona p) {
        personaService.save(p);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        personaService.delete(id);
    }
}
