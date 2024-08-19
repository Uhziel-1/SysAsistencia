package pe.edu.upeu.sysasistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_escuela")
public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 60)
    private String nombreeap;
    @Column(nullable = false, length = 8)
    private String estado;
    @Column(nullable = false, length = 8)
    private String inicialeseap;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "facultad_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_ESCUELA_FACULTAD"))
    private Facultad facultadId;
}
