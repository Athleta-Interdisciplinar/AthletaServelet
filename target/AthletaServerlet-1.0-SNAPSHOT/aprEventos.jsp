<!DOCTYPE html>
<html lang="pt-br">
<head>
    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="AthletaSite-main/styles/style.css">
    <link rel="stylesheet" href="AthletaSite-main/styles/admin.css">
    <link rel="shortcut icon" href="AthletaSite-main/imagens/acesso%20restrito.jpg" type="image/x-icon">
    <title>Athleta - Aprovar Eventos</title>
</head>
<body>

    <!-- -=-=-=-=-=-=-=-=-=-=-=-=-=- HEADER -=-=-=-=-=-=-=-=-=-=-=-=-=-  -->

    <header>
        <a href="index.html" class="lg">
            <img src="AthletaSite-main/imagens/logo_Branca.png" alt="Logo Athleta" class="tpLogo">
        </a>
        <a href="admin.jsp">
            <div class="tpConta">
            <p>Voltar</p>
            <img src="AthletaSite-main/imagens/seta.png" alt="">x
            </div>
        </a>
    </header>

    <!-- -=-=-=-=-=-=-=-=-=-=-=-=- APROV-EVENTOS -=-=-=-=-=-=-=-=-=-=-=-=-  -->

    <div class="aprEventos" id="aprEventos">
        <div class="aprEventos-txt">
            <div class="aprEventos-blocos">
                <p>Nome do Evento: <spa>${nome}</spa></p>
            </div>
            <div class="aprEventos-blocos">
                <p>Descrição: <spa>${descricao}</spa></p>
            </div>
            <div class="aprEventos-blocos">
                <p>Local: <spa>${local}</spa></p>
            </div>
            <div class="aprEventos-blocos">
                <p>Organizador: <spa>${organizador}</spa></p>
            </div>
            <div class="aprEventos-blocos">
                <p>Data do Evento: <spa>${data}</spa></p>
            </div>
        </div>

        <form action="aprovar-eventos">
            <div class="apr_neg">
                <input type="button" value="Aprovar" placeholder="Aprovar" class="aprovar">
                <input type="button" value="Negar" class="negar">
            </div>
        </form>
    </div>
    
    <style>
        body{
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
    </style>
</body>
</html>