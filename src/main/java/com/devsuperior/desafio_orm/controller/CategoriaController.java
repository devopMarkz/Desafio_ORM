package com.devsuperior.desafio_orm.controller;

import com.devsuperior.desafio_orm.controller.dto.CategoriaDtoResponse;
import com.devsuperior.desafio_orm.controller.dto.CreateCategoriaDto;
import com.devsuperior.desafio_orm.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<?> createCategoria(@RequestBody CreateCategoriaDto createCategoriaDto) {
        var categoria = categoriaService.createCategoria(createCategoriaDto);
        if(categoria != null) return ResponseEntity.ok("Categoria de ID " + categoria.getId() + " criada!");
        else return ResponseEntity.badRequest().body("Não foi possível criar a categoria.");
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
