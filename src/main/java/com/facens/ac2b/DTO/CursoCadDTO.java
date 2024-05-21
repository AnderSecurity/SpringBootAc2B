package com.facens.ac2b.DTO;

import lombok.*;

import java.util.List;

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
