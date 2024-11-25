package com.devsuperior.desafio_orm.repository;

import com.devsuperior.desafio_orm.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository
        extends JpaRepository<Categoria, Long> {
}
