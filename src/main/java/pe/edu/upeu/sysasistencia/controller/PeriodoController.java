package pe.edu.upeu.sysasistencia.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.dtos.PeriodoDTO;
import pe.edu.upeu.sysasistencia.mappers.PeriodoMapper;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    @Autowired // Se puede comentar, pero se debe poner final abajo.
    private PeriodoService periodoService; // Inyección de dependencia por metodo.

    private final PeriodoMapper periodoMapper; // Inyeccion de dependencia por constructor

    @GetMapping("/list")
    public ResponseEntity<List<PeriodoDTO>> findAll() {
        List<PeriodoDTO> p=periodoMapper.toDTOs(periodoService.findAll());
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PeriodoDTO> findByPerido(@PathVariable Long id) {
        PeriodoDTO p=periodoMapper.toDTO(periodoService.findById(id));
        return ResponseEntity.ok().body(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PeriodoDTO p) {
        periodoService.save(periodoMapper.toEntity(p));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        periodoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    /*
    @GetMapping("/list")
    public ResponseEntity<List<Periodo>> findAll() {
        List<Periodo> p=periodoService.findAll();
        return ResponseEntity.ok().body(p);
    }


    // @GetMapping("/list")
    // public List<Periodo> findAll() {
    //    return periodoService.obtenerPeriodos();
    // }


    @GetMapping("/list/{id}")
    public ResponseEntity<Periodo> findByPerido(@PathVariable Long id) {
        Periodo p=periodoService.findById(id);
        return ResponseEntity.ok().body(p);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Periodo p) {
        periodoService.save(p);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        periodoService.delete(id);
    }
     */
}
