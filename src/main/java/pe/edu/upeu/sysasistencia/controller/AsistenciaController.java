package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Asistencia;
import pe.edu.upeu.sysasistencia.service.AsistenciaService;

import java.util.List;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping("/list")
    public ResponseEntity<List<Asistencia>> findAll() {
        List<Asistencia> a=asistenciaService.obtenerAsistencias();
        return ResponseEntity.ok().body(a);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Asistencia> findByAcceso(@PathVariable Long id) {
        Asistencia a=asistenciaService.obtenerAsistencia(id);
        return ResponseEntity.ok().body(a);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Asistencia a) {
        asistenciaService.guardarAsistencia(a);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        asistenciaService.eliminarAsistencia(id);
    }
}
