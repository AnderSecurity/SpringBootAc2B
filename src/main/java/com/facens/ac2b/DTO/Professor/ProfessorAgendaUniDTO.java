package com.facens.ac2b.DTO.Professor;

import com.facens.ac2b.DTO.Agenda.AgendaDTO;
import com.facens.ac2b.model.entity.Professor;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorAgendaUniDTO {
    private String nome;
    private AgendaDTO agenda;

    public ProfessorAgendaUniDTO(Professor entity) {
        this.nome = entity.getName();
        this.agenda = new AgendaDTO(entity.getAgenda().stream().findFirst().orElseThrow());
    }
}
