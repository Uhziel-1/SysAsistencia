package pe.edu.upeu.sysasistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_facultad")
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombrefac", nullable = false, length = 60)
    private String nombrefac;
    @Column(name = "estado", nullable = false, length = 8)
    private String estado;
    @Column(name = "iniciales", nullable = false, length = 8)
    private String iniciales;
}
