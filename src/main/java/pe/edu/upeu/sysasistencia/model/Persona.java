package pe.edu.upeu.sysasistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 10)
    private String codigo;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 40)
    private String apellido_pat;
    @Column(nullable = false, length = 40)
    private String apellido_mat;
    @Column(nullable = false, length = 12)
    private String celular;
    @Column(nullable = false, length = 40)
    private String correo;
    @Column(nullable = false, length = 12)
    private String tipo;
    @Column(nullable = false, length = 8)
    private String estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "escuela_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_PERSONA_ESCUELA"))
    private Escuela escuelaId;
}
