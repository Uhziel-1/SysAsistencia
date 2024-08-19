package pe.edu.upeu.sysasistencia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "upeu_evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String nombreEvento;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime horai;

    @Column(nullable = false)
    private LocalTime minToler;

    @Column(nullable = false, length = 60)
    private String latitud;

    @Column(nullable = false, length = 60)
    private String longitud;

    @Column(nullable = false, length = 8)
    private String estado;

    @Column(nullable = false, length = 2)
    private String evaluar;

    @Column(nullable = false, length = 20)
    private String perfilEvento;

    @Column(nullable = false, length = 100)
    private String userCreate;

    @Column(nullable = false, length = 200)
    private String mater;

    @Column(nullable = false, length = 2)
    private String validInsc;

    @Column(nullable = false, length = 2)
    private String asisSubact;

    @Column(nullable = false, length = 2)
    private String intsal;

    @Column(nullable = false, length = 5)
    private String offlinex;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "periodo_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_EVENTO_PERIODO"))
    private Periodo periodoId;
}
