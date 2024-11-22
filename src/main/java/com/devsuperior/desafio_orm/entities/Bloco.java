package com.devsuperior.desafio_orm.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @Column(name = "bloco_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @Column(name = "inicio")
    private Date inicio;

    @Column(name = "fim")
    private Date fim;

    public Bloco() {
    }

    public Bloco(Integer id, Atividade atividade, Date inicio, Date fim) {
        this.id = id;
        this.atividade = atividade;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
