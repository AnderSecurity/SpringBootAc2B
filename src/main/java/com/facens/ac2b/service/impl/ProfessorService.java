package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.EnderecoDTO;
import com.facens.ac2b.DTO.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.ProfessorCadDTO;
import com.facens.ac2b.DTO.ProfessorDTO;
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
        return professorRepository.findById(profId).map(ProfessorAgendaDTO::new).orElseThrow();
    }
}
