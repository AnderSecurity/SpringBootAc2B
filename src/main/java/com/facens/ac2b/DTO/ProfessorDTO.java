package com.facens.ac2b.DTO;

import com.facens.ac2b.model.entity.Professor;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDTO {
    private String nome;

    public ProfessorDTO(Professor entity){
        this.nome = entity.getName();
    }
}
