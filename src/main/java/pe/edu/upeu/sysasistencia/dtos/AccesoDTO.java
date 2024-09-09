package pe.edu.upeu.sysasistencia.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.sysasistencia.model.Rol;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccesoDTO {
    private Long id;
    private String nombre;
    private String url;
    private String icono;
    private List<Rol> roles;
}
