package com.facens.ac2b.DTO.Curso;


import com.facens.ac2b.DTO.Professor.ProfessorDTO;
import com.facens.ac2b.model.entity.Curso;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoAllowDTO {
    private String nomeCurso;
    private List<ProfessorDTO> professores;

    public CursoAllowDTO(Curso entity) {
        this.nomeCurso = entity.getName();
        this.professores = entity.getProfessorList().stream().map(ProfessorDTO::new).toList();
    }
}
