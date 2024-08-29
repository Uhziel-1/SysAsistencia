package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.model.Usuario;
import pe.edu.upeu.sysasistencia.repository.UsuarioRepository;
import pe.edu.upeu.sysasistencia.service.UsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void actualizarUsuario(Usuario usuario, Long id) {
        usuarioRepository.save(new Usuario());
    }
}
