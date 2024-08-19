package pe.edu.upeu.sysasistencia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private LocalTime hora;
    @Column(nullable = false, length = 60)
    private String latitud;
    @Column(nullable = false, length = 60)
    private String longitud;
    @Column(nullable = false, length = 20)
    private String tipo;
    @Column(nullable = false, length = 20)
    private Integer calificacion;
    @Column(nullable = false, length = 12)
    private String tipo_reg;
    @Column(nullable = false, length = 2)
    private String entsal;
    @Column(nullable = false)
    private Long id_subactasis;
    @Column(nullable = false, length = 5)
    private String offlinex;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_ASISTENCIA_PERSONA"))
    private Persona personaId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "evento_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_ASISTENCIA_EVENTO"))
    private Evento eventoId;
}
