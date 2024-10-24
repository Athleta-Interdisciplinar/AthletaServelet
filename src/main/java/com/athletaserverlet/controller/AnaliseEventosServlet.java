package com.athletaserverlet.controller;

import com.athletaserverlet.dao.AdminDao;
import com.athletaserverlet.dao.AnaliseEventosDao;
import com.athletaserverlet.model.Admin;
import com.athletaserverlet.model.AnaliseEventos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "aprovarEvento", value = "/aprovarEvento")
public class AnaliseEventosServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AnaliseEventosDao AnaliseDao = new AnaliseEventosDao();
        ResultSet rset = AnaliseDao.buscarAnalise();
        try {
            if (rset.next()) {
                request.setAttribute("descricao", rset.getString("descricao"));
                request.setAttribute("nome", rset.getString("nome"));
                request.setAttribute("local", rset.getString("endereco"));
                request.setAttribute("organizador", rset.getString("organizador"));
                request.setAttribute("data", rset.getString("dt_evento"));
            }
        }catch (RuntimeException re) {
            // Em caso de exceção em tempo de execução, redireciona para uma página de erro
            request.getRequestDispatcher("errorCon.html").forward(request, response);
            response.sendError(400, "Erro de Conexão");
        } catch (SQLException e) {
            // Em caso de erro ao acessar o banco de dados, redireciona para outra página de erro
            request.getRequestDispatcher("errorConBanco.html").forward(request, response);
            response.sendError(400, "Erro de Conexão com o Banco");
        }
    }

}
