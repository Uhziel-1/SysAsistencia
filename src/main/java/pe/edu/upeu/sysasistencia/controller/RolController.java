package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Rol;
import pe.edu.upeu.sysasistencia.service.RolService;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/list")
    public ResponseEntity<List<Rol>> findAll() {
        List<Rol> r=rolService.findAll();
        return ResponseEntity.ok().body(r);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Rol> findByAcceso(@PathVariable Long id) {
        Rol r=rolService.findById(id);
        return ResponseEntity.ok().body(r);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Rol r) {
        rolService.save(r);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        rolService.delete(id);
    }
}
