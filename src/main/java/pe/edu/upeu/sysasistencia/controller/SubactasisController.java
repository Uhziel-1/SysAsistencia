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
        List<Subactasis> s=subactasisService.obtenerListaSubactasis();
        return ResponseEntity.ok().body(s);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Subactasis> findByAcceso(@PathVariable Long id) {
        Subactasis s=subactasisService.obtenerSubactasis(id);
        return ResponseEntity.ok().body(s);
    }

    @GetMapping("/guardar")
    public void guardar(@RequestBody Subactasis s) {
        subactasisService.guardarSubactasis(s);
    }

    @GetMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        subactasisService.eliminarSubactasis(id);
    }
}
