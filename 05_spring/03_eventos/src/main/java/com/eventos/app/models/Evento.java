package com.eventos.app.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @Column(name = "id_evento", nullable = false, updatable = false)
    private String idEvento;

    private String nome;
    private String local;
    private LocalDate data;
    private LocalTime hora;
    private String imagem;

    @PrePersist
    public void gerarId() {
        this.idEvento = UUID.randomUUID().toString();
    }

    // getters e setters



    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
