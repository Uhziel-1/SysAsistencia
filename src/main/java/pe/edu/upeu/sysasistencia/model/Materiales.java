package pe.edu.upeu.sysasistencia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_materiales")
public class Materiales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String mater_entre;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private LocalTime hora_reg;
    @Column(nullable = false, length = 60)
    private String latitud;
    @Column(nullable = false, length = 60)
    private String longitud;
    @Column(nullable = false)
    private Timestamp mod_fh;
    @Column(nullable = false, length = 2)
    private String offlinex;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "eventoinscripcion_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_MATERIALES_EVENTOINSCRIPCION"))
    private EventoInscripcion eventoInscripcionId;
}
