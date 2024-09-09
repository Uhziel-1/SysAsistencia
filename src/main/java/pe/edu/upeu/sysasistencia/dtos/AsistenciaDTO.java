package pe.edu.upeu.sysasistencia.dtos;

import pe.edu.upeu.sysasistencia.model.Asistencia;
import pe.edu.upeu.sysasistencia.model.Evento;
import pe.edu.upeu.sysasistencia.model.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class AsistenciaDTO {
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private String latitud;
    private String longitud;
    private String tipo;
    private Integer calificacion;
    private String tipo_reg;
    private String entsal;
    private Long id_subactasis;
    private String offlinex;
    private Persona personaId;
    private Evento eventoId;
}
