package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Periodo;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;

@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    @Autowired
    private PeriodoService periodoService;

    @GetMapping("/list")
    public ResponseEntity<List<Periodo>> findAll() {
        List<Periodo> p=periodoService.obtenerPeriodos();
        return ResponseEntity.ok().body(p);
    }

    /*
    @GetMapping("/list")
    public List<Periodo> findAll() {
        return periodoService.obtenerPeriodos();
    }
     */

    @GetMapping("/list/{id}")
    public ResponseEntity<Periodo> findByPerido(@PathVariable Long id) {
        Periodo p=periodoService.obtenerPeriodo(id);
        return ResponseEntity.ok().body(p);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Periodo p) {
        periodoService.guardarPeriodo(p);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        periodoService.eliminarPeriodo(id);
    }
}
