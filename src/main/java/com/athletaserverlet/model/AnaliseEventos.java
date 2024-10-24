package com.athletaserverlet.model;

import java.util.Date;

public class AnaliseEventos {
    int id;
    String nome;
    String descricao;
    Date dt_evento;
    String organizador;
    int id_usuario;
    int id_local;

    public AnaliseEventos(String nome, String descricao, Date dt_evento, String organizador) {
        this.nome = nome;
        this.descricao = descricao;
        this.dt_evento = dt_evento;
        this.organizador = organizador;
    }

    public AnaliseEventos(int id, String nome, String descricao, Date dt_evento, String organizador, int id_usuario, int id_local) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dt_evento = dt_evento;
        this.organizador = organizador;
        this.id_usuario = id_usuario;
        this.id_local = id_local;
    }
    public AnaliseEventos(){}
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDt_evento() {
        return dt_evento;
    }

    public String getOrganizador() {
        return organizador;
    }

//    public int getId_usuario() {
//        return id_usuario;
//    }
//
//    public int getId_local() {
//        return id_local;
//    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDt_evento(Date dt_evento) {
        this.dt_evento = dt_evento;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String toString() {
        return "id: " + id +
                " nome: " + nome + '\'' +
                " descricao: " + descricao + '\'' +
                " dt_evento: " + dt_evento +
                " organizador: " + organizador + '\'' +
                " id_usuario: " + id_usuario +
                " id_local: " + id_local ;
    }
}
