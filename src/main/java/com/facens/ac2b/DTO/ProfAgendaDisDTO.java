package com.facens.ac2b.DTO;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfAgendaDisDTO {
    private Long profId;
    private LocalDate data;
}
