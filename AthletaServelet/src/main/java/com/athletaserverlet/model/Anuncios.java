package com.athletaserverlet.model;

public class Anuncios {
    private double preco;
    private String descricao;
    private String nome;
    private String estado;
    private int quantidade;
    private int id_anuncio;
    private int id_usuario;

    public Anuncios(double preco, String descricao, String nome, String estado, int quantidade, int id_anuncio, int id_usuario){
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
        this.estado = estado;
        this.quantidade = quantidade;
        this.id_anuncio = id_anuncio;
        this.id_usuario = id_usuario;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getId_anuncio() {
        return id_anuncio;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public String toString() {
        return "Preço: " + preco +
                "\nDescrição do Anúncio: " + descricao +
                "\nNome do Produto Anunciado: " + nome +
                "\nEstado de onde vem o produto anunciado: " + estado +
                "\nQuantidade de produtos: " + quantidade +
                "\nID do Anúncio: " + id_anuncio +
                "\nID do Usuário: " + id_usuario;
    }
}