package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.model.Usuario;
import pe.edu.upeu.sysasistencia.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> u=usuarioService.findAll();
        return ResponseEntity.ok().body(u);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Usuario> findByAcceso(@PathVariable Long id) {
        Usuario u=usuarioService.findById(id);
        return ResponseEntity.ok().body(u);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Usuario u) {
        usuarioService.save(u);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioService.delete(id);
    }
}
