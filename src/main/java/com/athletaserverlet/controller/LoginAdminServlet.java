package com.athletaserverlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.athletaserverlet.dao.AdminDao;

// Define um servlet que responde a requisições na URL "/login"
@WebServlet(name = "login", value = "/login")
public class LoginAdminServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Cria uma instância da classe AdminDao
        AdminDao adminDao = new AdminDao();

        // Obtém os parâmetros "email" e "senha" enviados na requisição
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        try {
            // Chama o método verificarSenha do AdminDao para validar as credenciais
            ResultSet resultSet = adminDao.verificarSenha(email, senha);

            // Verifica se o ResultSet contém algum resultado
            if (resultSet.next()) {
                // Obtém o valor do campo "senha" do ResultSet
                boolean verificarAdm = resultSet.getBoolean("senha");

                // Se a senha estiver correta, redireciona para a página do admin
                if (verificarAdm) {
                    request.getRequestDispatcher("admin.jsp").forward(request, response);
                } else {
                    // Se a senha estiver incorreta, configura um atributo de erro e redireciona para o login
                    request.setAttribute("erro", "E-mail ou senha incorretos.");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } else {
                // Se o ResultSet não contiver resultados, significa que o usuário não foi encontrado
                request.setAttribute("erro", "E-mail ou senha incorretos.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

        } catch (RuntimeException re) {
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
