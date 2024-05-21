package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.*;
import com.facens.ac2b.model.entity.Endereco;
import com.facens.ac2b.model.entity.Professor;
import com.facens.ac2b.repository.ProfessorRepository;
import com.facens.ac2b.service.model.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfessorService implements IProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void save(ProfessorCadDTO cadProf) {
        EnderecoDTO endto = cadProf.getEndereco();
        Endereco end = Endereco.builder()
                .CEP(endto.getCEP())
                .city(endto.getCidade())
                .state(endto.getEstado())
                .build();
        Professor prof = Professor.builder()
                        .name(cadProf.getNome())
                        .CPF(cadProf.getCPF())
                        .RG(cadProf.getRG())
                        .cellphoneNumber(cadProf.getCelular())
                        .endereco(end)
                        .build();
        professorRepository.save(prof);
    }

    @Override
    public ProfessorAgendaDTO findById(Long profId) {
        return new ProfessorAgendaDTO(professorRepository.findByProfessor_IdProfessor(profId));
    }

    @Override
    public AgendaDTO findAgendaById(Long profId, Long agendaId) {
        return new AgendaDTO(professorRepository.findByIdAgendaAndProfessor_IdProfessor(agendaId, profId));
    }


}
