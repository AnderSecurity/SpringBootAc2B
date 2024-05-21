package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.Endereco.EnderecoDTO;
import com.facens.ac2b.DTO.Professor.ProfessorAgendaDTO;
import com.facens.ac2b.DTO.Professor.ProfessorAgendaUniDTO;
import com.facens.ac2b.DTO.Professor.ProfessorCadDTO;
import com.facens.ac2b.model.entity.Endereco;
import com.facens.ac2b.model.entity.Professor;
import com.facens.ac2b.repository.ProfessorRepository;
import com.facens.ac2b.service.model.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService implements IProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Long save(ProfessorCadDTO cadProf) {
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
        return professorRepository.save(prof).getIdProfessor();
    }

    @Override
    public ProfessorAgendaDTO findById(Long profId) {
        return new ProfessorAgendaDTO(professorRepository.findWithAgendaById(profId));
    }

    @Override
    public ProfessorAgendaUniDTO findAgendaById(Long profId, Long agendaId) {
        return new ProfessorAgendaUniDTO(professorRepository.findByIdProfessorAndAgenda_IdAgenda(agendaId, profId));
    }


}
