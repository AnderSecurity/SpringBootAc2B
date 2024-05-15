package com.facens.ac2b.service.model;

import com.facens.ac2b.DTO.ModelDTO;
import com.facens.ac2b.DTO.ModelReturnDTO;
import org.springframework.stereotype.Service;

@Service // diz que a interface é um repositorio
// essa classe define os metodos que serão utilizados
public interface IModelService {
    ModelDTO create(ModelDTO modelDTO);// cria um novo modelo com base no DTO passado
    ModelReturnDTO findById(Long id); // busca um modelo pelo id e retorna o DTO correspondente
}
