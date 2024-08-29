package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Materiales;
import pe.edu.upeu.sysasistencia.service.MaterialesService;

import java.util.List;

@RestController
@RequestMapping("/materiales")
public class MaterialesController {

    @Autowired
    private MaterialesService materialesService;

    @GetMapping("/list")
    public ResponseEntity<List<Materiales>> findAll() {
        List<Materiales> m=materialesService.obtenerListaMateriales();
        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Materiales> findByAcceso(@PathVariable Long id) {
        Materiales m=materialesService.obtenerMateriales(id);
        return ResponseEntity.ok().body(m);
    }

    @GetMapping("/guardar")
    public void guardar(@RequestBody Materiales m) {
        materialesService.guardarMateriales(m);
    }

    @GetMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        materialesService.eliminarMateriales(id);
    }
}
