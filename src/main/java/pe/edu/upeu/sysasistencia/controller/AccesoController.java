package pe.edu.upeu.sysasistencia.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.dtos.AccesoDTO;
import pe.edu.upeu.sysasistencia.mappers.AccesoMapper;
import pe.edu.upeu.sysasistencia.model.Acceso;
import pe.edu.upeu.sysasistencia.service.AccesoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/acceso")
public class AccesoController {

    @Autowired
    private AccesoService accesoService;

    private final AccesoMapper accesoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<AccesoDTO>> findAll() {
        List<AccesoDTO> a=accesoMapper.toDTOs(accesoService.findAll());
        return ResponseEntity.ok().body(a);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<AccesoDTO> findByAcceso(@PathVariable Long id) {
        AccesoDTO a=accesoMapper.toDTO(accesoService.findById(id));
        return ResponseEntity.ok().body(a);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@RequestBody AccesoDTO a) {
        accesoService.save(accesoMapper.toEntity(a));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        accesoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
