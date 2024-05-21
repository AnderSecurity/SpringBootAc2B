package com.facens.ac2b.DTO.Agenda;

import com.facens.ac2b.DTO.Curso.CursoDTO;
import com.facens.ac2b.model.entity.Agenda;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendaDTO {

    private CursoDTO curso;
    private LocalDate dataIni;
    private LocalDate dataFim;
    private String ocorrencia;

    public AgendaDTO(Agenda entity){
        this.dataIni = entity.getDataInit();
        this.dataFim = entity.getDataFim();
        this.ocorrencia = entity.getOcorrencia();
        this.curso = new CursoDTO(entity.getCurso());
    }
}
