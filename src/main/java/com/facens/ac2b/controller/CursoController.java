package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.CursoCadDTO;
import com.facens.ac2b.DTO.ProfessorDTO;
import com.facens.ac2b.DTO.VincularCursoDTO;
import com.facens.ac2b.service.model.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {


    @Autowired
    private ICursoService cursoService;

    @GetMapping("/{idcurso}/professores")
    private List<ProfessorDTO> professores(@PathVariable Long idcurso){
        return cursoService.findAllAllow(idcurso);
    }

    @PostMapping("/cad")
    public void create(@RequestBody CursoCadDTO dto) {
        cursoService.create(dto);
    }

    @PutMapping("/vincula")
    public void vinculaProfessor(@RequestBody VincularCursoDTO ids) {
        cursoService.vinculaProfessor(ids);
    }


}
