package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Facultad;
import pe.edu.upeu.sysasistencia.service.FacultadService;

import java.util.List;

@RestController
@RequestMapping("/facultad")
public class FacultadController {

    @Autowired
    private FacultadService facultadService;

    @GetMapping("/list")
    public ResponseEntity<List<Facultad>> findAll() {
        List<Facultad> f=facultadService.obtenerFacultades();
        return ResponseEntity.ok().body(f);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Facultad> findByAcceso(@PathVariable Long id) {
        Facultad f=facultadService.obtenerFacultad(id);
        return ResponseEntity.ok().body(f);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Facultad f) {
        facultadService.guardarFacultad(f);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        facultadService.eliminarFacultad(id);
    }
}
