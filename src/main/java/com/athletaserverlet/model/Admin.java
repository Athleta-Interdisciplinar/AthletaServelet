package com.athletaserverlet.model;

public class Admin {
    private int id_admin;
    private String nome;
    private String email;
    private String senha;

    public Admin(String nome, String email, String senha){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString(){
        return "========Admin========\n" +
                "Id Admin: " + this.id_admin +
                "\nNome: " + this.nome +
                "\nE-mail: " + this.email +
                "\nSenha: " + this.senha;
    }
}
