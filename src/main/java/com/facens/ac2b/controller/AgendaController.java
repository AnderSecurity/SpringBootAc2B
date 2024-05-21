package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.AgendaOcorrenciaDTO;
import com.facens.ac2b.DTO.ProfAgendaDisDTO;
import com.facens.ac2b.service.model.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private IAgendaService agendaService;

    @PutMapping("/ocorrencia")
    private void updateOcorrencia(@RequestBody AgendaOcorrenciaDTO ocorrencia) {
        agendaService.updateOcorenca(ocorrencia.getOcorrencia(), ocorrencia.getId());
    }

    @GetMapping("/disponibilidade")
    private boolean verificaDisponibilidade(@RequestBody ProfAgendaDisDTO prof) {
        return agendaService.verificaAgendaDisponivel(prof.getProfId(), prof.getData());
    }
}
