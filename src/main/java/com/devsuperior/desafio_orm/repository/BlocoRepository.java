package com.devsuperior.desafio_orm.repository;

import com.devsuperior.desafio_orm.entities.Bloco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocoRepository
        extends JpaRepository<Bloco, Long> {
}