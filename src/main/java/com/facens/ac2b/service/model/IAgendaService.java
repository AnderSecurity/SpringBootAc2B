package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.Agenda.AgendaCadDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface IAgendaService{
    Boolean verificaAgendaDisponivel(Long professorId, LocalDate date);
    void updateOcorenca(String ocorrencia, Long agendaId);

    Long create(AgendaCadDTO dto);
}
