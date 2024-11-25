package com.devsuperior.desafio_orm.controller;

import com.devsuperior.desafio_orm.controller.dto.CategoriaDtoResponse;
import com.devsuperior.desafio_orm.controller.dto.CreateCategoriaDto;
import com.devsuperior.desafio_orm.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<?> createCategoria(@RequestBody CreateCategoriaDto createCategoriaDto) {
        var categoria = categoriaService.createCategoria(createCategoriaDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(categoria.getId())
                .toUri();
        return ResponseEntity.created(location).body(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoria(@PathVariable("id") Integer id){
        var categoria = categoriaService.getCategoria(id);
        return ResponseEntity.ok(categoria);
    }

    @PutMapping
    public ResponseEntity<Void> updateCategoria(@RequestBody CategoriaDtoResponse categoriaDtoUpdate){
        categoriaService.updateCategoria(categoriaDtoUpdate);
        return ResponseEntity.noContent().build();
    }

}
