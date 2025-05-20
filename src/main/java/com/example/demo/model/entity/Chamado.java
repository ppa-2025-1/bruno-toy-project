package com.example.demo.model.entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Chamado extends BaseEntity {

    @Column(nullable = false, unique = false, length = 255)
    private String acao;

    @Column(nullable = false, unique = false, length = 255)
    private String objeto;

    @Column(nullable = false, unique = false, length = 255)
    private String detalhamento;

    @Column(nullable = true, unique = false, length = 255)
    private Integer usuarioId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, unique = false)
    private Situacao situacao;

    public enum Situacao {
        NOVO, ANDAMENTO, RESOLVIDO, CANCELADO
    }

    //Getters & Setters

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    

}
