package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.Curso.CursoAllowDTO;
import com.facens.ac2b.DTO.Curso.CursoCadDTO;
import com.facens.ac2b.DTO.Curso.VincularCursoDTO;
import com.facens.ac2b.model.entity.Curso;
import com.facens.ac2b.model.entity.Professor;
import com.facens.ac2b.repository.CursoRepository;
import com.facens.ac2b.repository.ProfessorRepository;
import com.facens.ac2b.service.model.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public CursoAllowDTO findAllAllow(Long cursoId) {
        return new CursoAllowDTO(cursoRepository.findAllowProf(cursoId));
    }

    @Override
    public Long create(CursoCadDTO cursoCadDTO) {
        Curso curso = Curso.builder()
                .description(cursoCadDTO.getDescricao())
                .ementa(cursoCadDTO.getEmenta())
                .workLoad(cursoCadDTO.getCargaHoraria())
                .objectives(cursoCadDTO.getObjetivos())
                .name(cursoCadDTO.getNome()).build();
        return cursoRepository.save(curso).getIdCurso();

    }

    @Override
    public void vinculaProfessor(VincularCursoDTO ids) {
        Professor prof = professorRepository.findById(ids.getProfessorId()).orElseThrow();
        Curso curso = cursoRepository.findAllowProf(ids.getCursoId());
        curso.getProfessorList().add(prof);
        cursoRepository.save(curso);
    }
}
