package com.athletaserverlet.dao;
import java.sql.*;

//CLASSE PARA ARMAZENAR APENAS OS MÉTODOS DE CONECTAR E DESCONECTAR, OS INSERTS, REMOVES E UPDATES SARÃO FEITAS NAS CLASSES RESPECTIVAS

public class Conexao {
    private Connection conn;

    public Connection getConn() {
        return this.conn;
    }

    public void conectar(){
        try {
//        INFORMANDO QUAL DRIVER DE CONEXÃO SERÁ UTILIZADO PELO DRIVER MANAGER
            Class.forName("org.postgresql.Driver");
//        Criando a conexão com o BD
        conn = DriverManager.getConnection(System.getenv("URL"),System.getenv("USER"),System.getenv("PASS"));
        }catch (java.sql.SQLException a){
            a.printStackTrace();
        }
        catch (java.lang.ClassNotFoundException c){
            c.printStackTrace();
        }
    }

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
//            Desconectando do BD caso a conexao nao seja null
                conn.close();
            }
        } catch (java.sql.SQLException a) {
            a.printStackTrace();
        }
    }
//    ==============================================

}