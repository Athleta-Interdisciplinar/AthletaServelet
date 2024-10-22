package com.athletaserverlet.model;

public class CentrosEsportivos {
    private String nome;
    private String telefone;
    private String descricao;
    private int id_centro;
    private int id_local;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_centro() {
        return id_centro;
    }

    public int getId_local() {
        return id_local;
    }

    @Override
    public String toString() {
        return "Nome do CE: " + nome +
                "\nTelefone do CE: " + telefone +
                "\nDescrição do CE: " + descricao +
                "\nID do Centro: " + id_centro +
                "\nID do Local: " + id_local;
    }
}
