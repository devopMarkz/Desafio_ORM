package com.devsuperior.desafio_orm.service;

import com.devsuperior.desafio_orm.controller.dto.CategoriaDtoResponse;
import com.devsuperior.desafio_orm.controller.dto.CreateCategoriaDto;
import com.devsuperior.desafio_orm.entities.Categoria;
import com.devsuperior.desafio_orm.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria createCategoria(CreateCategoriaDto createCategoriaDto){
        Categoria categoria = convertCategoriaToEntity(createCategoriaDto);
        return categoriaRepository.save(categoria);
    }

    public Optional<CategoriaDtoResponse> getCategoria(Integer id){
        return categoriaRepository.findById(id.longValue())
                .map(categoria -> new CategoriaDtoResponse(categoria.getId(), categoria.getDescricao()));
    }

    public void updateCategoria(CategoriaDtoResponse categoriaDtoUpdate){
        var userEntity = categoriaRepository.findById(categoriaDtoUpdate.id().longValue());

        if(userEntity.isPresent()){
            var user = userEntity.get();

            if(categoriaDtoUpdate.descricao() != null) {
                user.setDescricao(categoriaDtoUpdate.descricao());
            }

            categoriaRepository.save(user);
        }
    }

    private Categoria convertCategoriaToEntity(CreateCategoriaDto createCategoriaDto){
        return new Categoria(
                null,
                createCategoriaDto.descricao()
        );
    }

}
