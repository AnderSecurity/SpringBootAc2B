package com.facens.ac2b.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VincularCursoDTO {
    private Long cursoId;
    private Long professorId;
}
