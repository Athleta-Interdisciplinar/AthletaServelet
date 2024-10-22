package com.athletaserverlet.model;

public class Forum {

    int id_forum;
    String nome;
    String descricao;
    int id_usuario;
    int id_admin;

    public Forum(int id_forum, String nome, String descricao, int id_usuario, int id_admin){
        this.id_forum = id_forum;
        this.nome = nome;
        this.descricao = descricao;
        this.id_usuario = id_usuario;
        this.id_admin = id_admin;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId_admin() {
        return id_admin;
    }

    public int getId_forum() {
        return id_forum;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String toString() {
        return "ID do Fórum: " + id_forum +
                "\nNome do Fórum: " + nome +
                "\nDescrição do Fórum: " + descricao +
                "\nID do Usuário: " + id_usuario +
                "\nID do Administrador: " + id_admin;
    }
}