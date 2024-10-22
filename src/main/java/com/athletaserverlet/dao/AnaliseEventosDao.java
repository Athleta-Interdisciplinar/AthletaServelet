package com.athletaserverlet.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AnaliseEventosDao {

    private PreparedStatement pstm;
    private ResultSet rset;
    private Conexao conexao = new Conexao();


    //    ========INSERIR UM EVENTO========
    public boolean inserirEvento(int id_evento, String nome, String descricao, LocalDate dtEvento, String organizador, String imagem, int idUsuario, int idLocal){
        conexao.conectar();//Abrindo conexão com o banco
        try {
            pstm = (conexao.getConn().prepareStatement("INSERT INTO EVENTO (ID_EVENTO,NOME,DESCRICAO,DT_EVENTO,ORGANIZADOR,IMG,ID_USUARIO,ID_LOCAL)VALUES (?,?,?,?,?,?,?,?)"));
//        Setando valores
            pstm.setInt(1, id_evento);
            pstm.setString(2, nome);
            pstm.setString(3, descricao);
            pstm.setDate(4, Date.valueOf(dtEvento));
            pstm.setString(5, organizador);
            pstm.setString(6, imagem);
            pstm.setInt(7, idUsuario);
            pstm.setInt(8, idLocal);

            return pstm.executeUpdate() > 0;//Executando o comando sql

        }catch (java.sql.SQLException e){
            e.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();//Fechando a conexão
        }
    }
    // ========REMOVENDO UM EVENTO========
    public boolean removerEvento(int idEvento){
        conexao.conectar();
        try{
            String remover = "DELETE FROM EVENTO WHERE ID_EVENTO=?";
            pstm = (conexao.getConn().prepareStatement(remover));
            pstm.setInt(1,idEvento);
            return pstm.executeUpdate() > 0;
        }catch (java.sql.SQLException a){
            a.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();
        }
//    ========ALTERANDO O NOME DO EVENTO========
    }
    public boolean alterarNome (String nome, int idEvento){
        conexao.conectar();
        try {
            pstm = (conexao.getConn().prepareStatement("UPDATE EVENTO SET NOME=? WHERE ID_EVENTO =?"));
            pstm.setString(1, nome);
            pstm.setInt(2,  idEvento);
            return pstm.executeUpdate() >0;
        }catch (java.sql.SQLException a){
            a.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();
        }
    }
    //    ========ALTERANDO A DESCRIÇÃO DO EVENTO========
    public boolean alterarDescricao (String descricao, int idEvento){
        conexao.conectar();
        try {
            pstm = (conexao.getConn().prepareStatement("UPDATE EVENTO SET DESCRICAO=? WHERE ID_EVENTO =?"));
            pstm.setString(1, descricao);
            pstm.setInt(2,  idEvento);
            return pstm.executeUpdate() >0;
        }catch (java.sql.SQLException a){
            a.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();
        }
    }
    //    ========ALTERANDO O ORGANIZADOR DO EVENTO========
    public boolean alterarOrganizador (String organizador, int idEvento){
        conexao.conectar();
        try {
            pstm = (conexao.getConn().prepareStatement("UPDATE EVENTO SET ORGANIZADOR=? WHERE ID_EVENTO =?"));
            pstm.setString(1, organizador);
            pstm.setInt(2,  idEvento);
            return pstm.executeUpdate() >0;
        }catch (java.sql.SQLException a){
            a.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();
        }
    }
    //    ========ALTERANDO A IMAGEM DO EVENTO========
    public boolean alterarImagem (String imagem, int idEvento){
        conexao.conectar();
        try {
            pstm = (conexao.getConn().prepareStatement("UPDATE EVENTO SET IMAGEM=? WHERE ID_EVENTO =?"));
            pstm.setString(1, imagem);
            pstm.setInt(2,  idEvento);
            return pstm.executeUpdate() >0;
        }catch (java.sql.SQLException a){
            a.printStackTrace();
            return false;
        }
        finally {
            conexao.desconectar();
        }
    }
    //    ========BUSCAR EVENTO========
    public ResultSet buscarEvento(){
        try {
            conexao.conectar();//Abrindo conexao com o banco
            pstm = conexao.getConn().prepareStatement("SELECT * FROM EVENTOS ORDER BY ID_ANUNCIO");

            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (SQLException sql){
            sql.printStackTrace();
            return null;
        } finally {
            conexao.desconectar();//Fechando a conexao com o banco
        }
    }
    //  ========BUSCAR POR ID========
    public ResultSet buscarPorId(int idEvento){
        try {
            conexao.conectar();//Abrindo conexao com o banco
            pstm = conexao.getConn().prepareStatement("SELECT * FROM EVENTO WHERE ID_EVENTO = ?  ORDER BY ID_ANUNCIO");
            pstm.setInt(1, idEvento);
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (SQLException sql){
            sql.printStackTrace();
            return null;
        } finally {
            conexao.desconectar();//Fechando a conexao com o banco
        }
    }
}
