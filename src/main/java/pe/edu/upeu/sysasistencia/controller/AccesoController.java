package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Acceso;
import pe.edu.upeu.sysasistencia.service.AccesoService;

import java.util.List;

@RestController
@RequestMapping("/acceso")
public class AccesoController {

    @Autowired
    private AccesoService accesoService;

    @GetMapping("/list")
    public ResponseEntity<List<Acceso>> findAll() {
        List<Acceso> a=accesoService.obtenerAccesos();
        return ResponseEntity.ok().body(a);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Acceso> findByAcceso(@PathVariable Long id) {
        Acceso a=accesoService.obtenerAcceso(id);
        return ResponseEntity.ok().body(a);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Acceso a) {
        accesoService.guardarAcceso(a);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        accesoService.eliminarAcceso(id);
    }
}
