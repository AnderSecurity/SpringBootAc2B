package com.facens.ac2b.DTO.Professor;

import com.facens.ac2b.DTO.Agenda.AgendaDTO;
import com.facens.ac2b.model.entity.Professor;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorAgendaDTO {
    private String nome;
    private List<AgendaDTO> agendas;

    public ProfessorAgendaDTO(Professor entity) {
        this.nome = entity.getName();
        this.agendas = entity.getAgenda().stream().map(AgendaDTO::new).toList();
    }

}
