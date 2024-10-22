package com.athletaserverlet.controller;

import com.athletaserverlet.dao.AdminDao;
import com.athletaserverlet.model.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "cadastrarAdmin", value = "/cadastrarAdmin")
public class CadastrarAdminServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AdminDao adminDao = new AdminDao();

        // Obtém os parâmetros da requisição
        String nome = request.getParameter("nomeAdmin");
        String email = request.getParameter("emailAdmin");
        String senha = request.getParameter("passwordAdmin");
        String confirmar = request.getParameter("confirmPasswordAdmin");

        //Verifica se e-mail e senha estão na formatação correta
        if (true) {
            //Verifica se a senha é igual a confirmar senha
            if (senha.equals(confirmar)) {
                // Cria o objeto Admin
                Admin admin = new Admin(nome, email, senha);

                // Realiza o cadastro do administrador
                int cadastroAdm = adminDao.cadastrarAdm(admin);

                // Verifica o resultado do cadastro
                if (cadastroAdm >= 1) {
                    request.setAttribute("resultado", "Administrador cadastrado!");
                } else if (cadastroAdm == 0) {
                    request.setAttribute("resultado", "Algo deu errado!");
                } else {
                    request.setAttribute("resultado", "Usuário já cadastrado!");
                }
                // Encaminha para a página JSP
                request.getRequestDispatcher("addAdmin.jsp").forward(request, response);
            } else {
                request.setAttribute("resultado","Senhas diferentes!");
                request.getRequestDispatcher("addAdmin.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("resultado","Senha ou e-mail fora de formatação!");
            request.getRequestDispatcher("addAdmin.jsp").forward(request, response);
        }
    }

}
