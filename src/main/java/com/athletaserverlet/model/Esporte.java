package com.athletaserverlet.model;

public class Esporte {
    private int idEsporte;
    private String nome;
    private String descricao;
    private String comoPraticar;

    public String getNome() {
        return nome;
    }

    public int getIdEsporte() {
        return idEsporte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComoPraticar() {
        return comoPraticar;
    }

    public void setComoPraticar(String comoPraticar) {
        this.comoPraticar = comoPraticar;
    }

    @Override
    public String toString() {
        return  "ID do Esporte: " + idEsporte +
                "Nome do Esporte: " + nome +
                "Descrição do Esporte: '" + descricao +
                "Como praticar: " + comoPraticar;
    }
}
