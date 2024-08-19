package pe.edu.upeu.sysasistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_eventoinscripcion")
public class EventoInscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 8)
    private String estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "evento_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_EVENTOINSCRIPCION_EVENTO"))
    private Evento eventoId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_EVENTOINSCRIPCION_PERSONA"))
    private Persona personaId;
}
