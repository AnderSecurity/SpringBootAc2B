package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.ProfessorCadDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service // diz que a interface é um repositorio
// essa classe define os metodos que serão utilizados
public interface IAgendaService{
    Boolean verificaAgendaDisponivel(Long professorId, LocalDate date);
    void updateOcorenca(String ocorrencia, Long agendaId);
}
