package com.facens.ac2b.DTO;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendaCadDTO {
    private Long cursoId;
    private LocalDate dataIni;
    private LocalDate dataFim;
    private Long professorId;
}
