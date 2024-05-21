package com.facens.ac2b.DTO.Curso;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VincularCursoDTO {
    private Long professorId;
    private Long cursoId;
}
