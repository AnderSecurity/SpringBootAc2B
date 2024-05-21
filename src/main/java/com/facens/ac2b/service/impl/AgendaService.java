package com.facens.ac2b.service.impl;

import com.facens.ac2b.model.entity.Agenda;
import com.facens.ac2b.repository.AgendaRepository;
import com.facens.ac2b.service.model.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AgendaService implements IAgendaService{

    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public Boolean verificaAgendaDisponivel(Long professorId, LocalDate date){
        return agendaRepository.existsByProfessor_IdProfessorAndDataInitGreaterThanEqualAndDataFimLessThanEqual(professorId, date, date);
    }

    @Override
    public void updateOcorenca(String ocorrencia, Long agendaId) {
        Agenda update = agendaRepository.findById(agendaId).orElseThrow();
        update.setOcorrencia(ocorrencia);
        agendaRepository.save(update);
    }


}
