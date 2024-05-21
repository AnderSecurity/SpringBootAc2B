package com.facens.ac2b.DTO.Curso;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoCadDTO {
    private String nome;
    private String descricao;
    private Float cargaHoraria;
    private String objetivos;
    private String ementa;

}
