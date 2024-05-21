package com.facens.ac2b.controller;

import com.facens.ac2b.DTO.Curso.CursoAllowDTO;
import com.facens.ac2b.DTO.Curso.CursoCadDTO;
import com.facens.ac2b.DTO.Curso.VincularCursoDTO;
import com.facens.ac2b.service.model.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
public class CursoController {


    @Autowired
    private ICursoService cursoService;

    @GetMapping("/{idcurso}/professores")
    public CursoAllowDTO professores(@PathVariable Long idcurso){
        return cursoService.findAllAllow(idcurso);
    }

    @PostMapping("/cad")
    public Long create(@RequestBody CursoCadDTO dto) {
        return cursoService.create(dto);
    }

    @PutMapping("/vincula")
    public void vinculaProfessor(@RequestBody VincularCursoDTO ids) {
        cursoService.vinculaProfessor(ids);
    }


}
