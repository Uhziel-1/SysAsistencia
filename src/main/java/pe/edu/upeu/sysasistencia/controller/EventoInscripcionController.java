package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.EventoInscripcion;
import pe.edu.upeu.sysasistencia.service.EventoInscripcionService;

import java.util.List;

@RestController
@RequestMapping("/eventoinscripcion")
public class EventoInscripcionController {

    @Autowired
    private EventoInscripcionService eventoInscripcionService;

    @GetMapping("/list")
    public ResponseEntity<List<EventoInscripcion>> findAll() {
        List<EventoInscripcion> e=eventoInscripcionService.obtenerEventoInscripcions();
        return ResponseEntity.ok().body(e);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EventoInscripcion> findByAcceso(@PathVariable Long id) {
        EventoInscripcion e=eventoInscripcionService.obtenerEventoInscripcion(id);
        return ResponseEntity.ok().body(e);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody EventoInscripcion e) {
        eventoInscripcionService.guardarEventoInscripcion(e);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        eventoInscripcionService.eliminarEventoInscripcion(id);
    }
}
