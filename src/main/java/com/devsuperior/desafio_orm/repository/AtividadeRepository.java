package com.devsuperior.desafio_orm.repository;

import com.devsuperior.desafio_orm.entities.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository
        extends JpaRepository<Atividade, Long> {
}
