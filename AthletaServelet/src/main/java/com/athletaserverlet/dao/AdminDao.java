package com.athletaserverlet.dao;

import com.athletaserverlet.model.Admin;

import java.sql.*;

public class AdminDao {
    private PreparedStatement pstm;
    private ResultSet rset;
    private Conexao conexao = new Conexao(); //Instanciando a classe Conexao

//  METODO DE CADASTRO DE ADMINISTRADOR
    public int cadastrarAdm(Admin administrador){
        try {
            conexao.conectar();//Abrindo conexao
            Connection conexao1 = conexao.getConn();
            pstm = conexao1.prepareStatement("INSERT INTO ADM(NOME, EMAIL, SENHA) VALUES(?, ?, ?)");

            pstm.setString(1,administrador.getNome());
            pstm.setString(2, administrador.getEmail());
            pstm.setString(3, administrador.getSenha());

            return pstm.executeUpdate();
        } catch (SQLException sql){
            sql.printStackTrace();
            return -1;
        } finally {
            conexao.desconectar();//Fechando conexao
        }
    }

//  METODO DE EXCLUSAO ADMINISTRADOR
    public int excluirAdm(int cod_admin){
        try {
            conexao.conectar();//Abrindo conexao
            pstm = conexao.getConn().prepareStatement("DELETE FROM ADM WHERE ID = ?");

            pstm.setInt(1, cod_admin);

            return cod_admin;
        } catch (SQLException sql){
            sql.printStackTrace();
            return -1;
        } finally {
            conexao.desconectar();//Fechando conexao
        }
    }

//  METODO QUE VERIFICA UMA SENHA E EMAIL NO BANCO
    public ResultSet verificarSenha(String email, String senha){
        try {
            conexao.conectar();//Abrindo conexao

            pstm = conexao.getConn().prepareStatement("SELECT CASE WHEN SENHA = ? THEN TRUE ELSE FALSE END AS SENHA FROM ADM WHERE EMAIL = ?");

            pstm.setString(1, senha);
            pstm.setString(2, email);

            rset = pstm.executeQuery();
            return rset;
        } catch (SQLException sql){
            sql.printStackTrace();
            return null;
        } finally {
            conexao.desconectar();//Fechando conexao
        }
    }

//   METODO TROCAR SENHA
    public int trocarSenha(String senha, String senhaAtual, String email){
        try {
            conexao.conectar();//Abrindo conexao
            ResultSet resultSet = verificarSenha(email,senha);//Pega o resultado da consulta
            if (resultSet.next()) {
                boolean verificacao = resultSet.getBoolean("SENHA");//Transformando o resultado da consulta em um Boolean
                if (verificacao) {
                    pstm = conexao.getConn().prepareStatement("UPDATE ADM SET SENHA = ? WHERE EMAIL = ?");

                    pstm.setString(1, senhaAtual);
                    pstm.setString(2, email);
                }
            }else{
                return -1;
            }
            return pstm.executeUpdate();
        } catch (SQLException sql){
            sql.printStackTrace();
            return -1;
        } finally {
            conexao.desconectar();//Fechar conexao
        }
    }
//  METODO PARA TROCAR O NOME
    public int trocarNomeAdm(String nome, String email){
        try {
            conexao.conectar();//Abrindo conexao
            pstm = conexao.getConn().prepareStatement("UPDATE ADM SET NOME = ? WHERE EMAIL = ?");

            pstm.setString(1, nome);
            pstm.setString(2, email);

            return pstm.executeUpdate();
        } catch (SQLException sql){
            sql.printStackTrace();
            return -1;
        } finally {
            conexao.desconectar();//Fechando conexao
        }
    }
}
