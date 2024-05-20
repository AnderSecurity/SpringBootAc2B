package com.facens.ac2b.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgenOcorrenciaDTO {
    private Long agendId;
    private String ocorrencia;
}
