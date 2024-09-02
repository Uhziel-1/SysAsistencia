package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Subactasis;
import pe.edu.upeu.sysasistencia.service.SubactasisService;

import java.util.List;

@RestController
@RequestMapping("/subactasis")
public class SubactasisController {

    @Autowired
    private SubactasisService subactasisService;

    @GetMapping("/list")
    public ResponseEntity<List<Subactasis>> findAll() {
        List<Subactasis> s=subactasisService.findAll();
        return ResponseEntity.ok().body(s);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Subactasis> findByAcceso(@PathVariable Long id) {
        Subactasis s=subactasisService.findById(id);
        return ResponseEntity.ok().body(s);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Subactasis s) {
        subactasisService.save(s);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        subactasisService.delete(id);
    }
}
