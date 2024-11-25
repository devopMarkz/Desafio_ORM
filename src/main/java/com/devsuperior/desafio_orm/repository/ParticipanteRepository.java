package com.devsuperior.desafio_orm.repository;

import com.devsuperior.desafio_orm.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository
        extends JpaRepository<Participante, Long> {
}
