package com.facens.ac2b.service.impl;

import com.facens.ac2b.DTO.ModelDTO;
import com.facens.ac2b.DTO.ModelReturnDTO;
import com.facens.ac2b.service.model.IModelService;
import org.springframework.stereotype.Service;

@Service // define que é um service
// essa classe implementa a interface IModelService e define os metodos que serão utilizados
public class modelService implements IModelService {

    @Override
    public ModelDTO create(ModelDTO modelDTO) {
        //logica que retorna ModelDTO vai aqui
        return null;

    }

    @Override
    public ModelReturnDTO findById(Long id) {
        //logica que retorna ModelReturnDTO vai aqui
        return null;
    }
}
