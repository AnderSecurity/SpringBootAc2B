package com.facens.ac2b.DTO.Professor;

import com.facens.ac2b.DTO.Endereco.EnderecoDTO;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorCadDTO {

    //crie os campos que vai usar
    private String nome;
    private String CPF;
    private String RG;
    private EnderecoDTO endereco;
    private String celular;
}
