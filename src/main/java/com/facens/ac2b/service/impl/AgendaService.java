package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.Agenda.AgendaCadDTO;
import com.facens.ac2b.model.entity.Agenda;
import com.facens.ac2b.model.entity.Curso;
import com.facens.ac2b.model.entity.Professor;
import com.facens.ac2b.repository.AgendaRepository;
import com.facens.ac2b.repository.CursoRepository;
import com.facens.ac2b.repository.ProfessorRepository;
import com.facens.ac2b.service.model.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AgendaService implements IAgendaService{

    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Boolean verificaAgendaDisponivel(Long professorId, LocalDate date){
        return agendaRepository.existsByProfessor_IdProfessorAndDataInitGreaterThanEqualAndDataFimLessThanEqual(professorId, date);
    }

    @Override
    public void updateOcorenca(String ocorrencia, Long agendaId) {
        Agenda update = agendaRepository.findById(agendaId).orElseThrow();
        update.setOcorrencia(ocorrencia);
        agendaRepository.save(update);
    }

    @Override
    public Long create(AgendaCadDTO dto) {
        if (dto.getDataIni().isBefore(dto.getDataFim())){
            Professor prof = professorRepository.findById(dto.getProfessorId()).orElseThrow();
            Curso curso = cursoRepository.findById(dto.getCursoId()).orElseThrow();
            Agenda agenda = Agenda.builder()
                    .dataInit(dto.getDataIni())
                    .dataFim(dto.getDataFim())
                    .professor(prof)
                    .curso(curso)
                    .build();
            return agendaRepository.save(agenda).getIdAgenda();
        }
        else {
            throw new IllegalArgumentException("Data inicial deve ser anterior a data final");
        }
    }
}
