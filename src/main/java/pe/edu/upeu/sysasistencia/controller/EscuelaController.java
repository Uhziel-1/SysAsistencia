package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Escuela;
import pe.edu.upeu.sysasistencia.service.EscuelaService;

import java.util.List;

@RestController
@RequestMapping("/escuela")
public class EscuelaController {

    @Autowired
    private EscuelaService escuelaService;

    @GetMapping("/list")
    public ResponseEntity<List<Escuela>> findAll() {
        List<Escuela> e=escuelaService.findAll();
        return ResponseEntity.ok().body(e);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Escuela> findByAcceso(@PathVariable Long id) {
        Escuela e=escuelaService.findById(id);
        return ResponseEntity.ok().body(e);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Escuela e) {
        escuelaService.save(e);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        escuelaService.delete(id);
    }
}
