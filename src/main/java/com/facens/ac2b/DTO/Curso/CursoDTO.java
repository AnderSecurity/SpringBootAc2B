package com.facens.ac2b.DTO.Curso;

import com.facens.ac2b.model.entity.Curso;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {

    private String cursoNome;
    private String description;
    private float cargaHoraria;
    private String objetivos;
    private String ementa;

    public CursoDTO(Curso entity){
        this.cursoNome = entity.getName();
        this.description = entity.getDescription();
        this.cargaHoraria = entity.getWorkLoad();
        this.objetivos = entity.getObjectives();
        this.ementa = entity.getEmenta();
    }
}
