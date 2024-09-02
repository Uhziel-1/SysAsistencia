package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Evento;
import pe.edu.upeu.sysasistencia.service.EventoService;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/list")
    public ResponseEntity<List<Evento>> findAll() {
        List<Evento> e=eventoService.findAll();
        return ResponseEntity.ok().body(e);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Evento> findByAcceso(@PathVariable Long id) {
        Evento e=eventoService.findById(id);
        return ResponseEntity.ok().body(e);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Evento e) {
        eventoService.save(e);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        eventoService.delete(id);
    }
}
