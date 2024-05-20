package com.facens.ac2b.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {
    private String cidade;
    private String estado;
    private String CEP;
}
