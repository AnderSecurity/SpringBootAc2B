package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.Agenda.AgendaCadDTO;
import com.facens.ac2b.DTO.Agenda.AgendaOcorrenciaDTO;
import com.facens.ac2b.DTO.Professor.ProfAgendaDisDTO;
import com.facens.ac2b.service.model.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private IAgendaService agendaService;

    @PutMapping("/ocorrencia")
    public void updateOcorrencia(@RequestBody AgendaOcorrenciaDTO ocorrencia) {
        agendaService.updateOcorenca(ocorrencia.getOcorrencia(), ocorrencia.getId());
    }

    @GetMapping("/disponibilidade")
    public boolean verificaDisponibilidade(@RequestBody ProfAgendaDisDTO prof) {
        return agendaService.verificaAgendaDisponivel(prof.getProfId(), prof.getData());
    }

    @PostMapping("/create")
    public Long create(AgendaCadDTO dto) {
        return agendaService.create(dto);
    }
}
