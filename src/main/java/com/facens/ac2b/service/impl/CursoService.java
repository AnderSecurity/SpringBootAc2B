package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.CursoCadDTO;
import com.facens.ac2b.DTO.ProfessorDTO;
import com.facens.ac2b.DTO.VincularCursoDTO;
import com.facens.ac2b.model.entity.Curso;
import com.facens.ac2b.model.entity.Professor;
import com.facens.ac2b.repository.CursoRepository;
import com.facens.ac2b.repository.ProfessorRepository;
import com.facens.ac2b.service.model.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<ProfessorDTO> findAllAllow(Long cursoId) {
        return cursoRepository.findByCurso_IdCurso(cursoId).stream().map(ProfessorDTO::new).toList();
    }

    @Override
    public void create(CursoCadDTO cursoCadDTO) {
        Curso curso = Curso.builder()
                .description(cursoCadDTO.getDescricao())
                .ementa(cursoCadDTO.getEmenta())
                .workLoad(cursoCadDTO.getCargaHoraria())
                .objectives(cursoCadDTO.getObjetivos())
                .name(cursoCadDTO.getNome()).build();
        cursoRepository.save(curso);

    }

    @Override
    public void vinculaProfessor(VincularCursoDTO ids) {
        Professor prof = professorRepository.findById(ids.getProfessorId()).orElseThrow();
        Curso curso = cursoRepository.findById(ids.getCursoId()).orElseThrow();
        curso.getProfessorList().add(prof);
        cursoRepository.save(curso);
    }
}
