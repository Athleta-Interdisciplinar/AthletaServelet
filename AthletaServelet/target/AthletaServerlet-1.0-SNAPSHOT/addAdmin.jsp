<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="AthletaSite-main/styles/style.css">
    <link rel="stylesheet" href="AthletaSite-main/styles/admin.css">
    <link rel="shortcut icon" href="AthletaSite-main/imagens/acesso%20restrito.jpg" type="image/x-icon">
    <title>Athleta - Adicionar Admin</title>
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
            <img src="AthletaSite-main/imagens/seta.png" alt="">
            </div>
        </a>
    </header>

    <!-- -=-=-=-=-=-=-=-=-=-=-=-=-=- ADD-ADMIN -=-=-=-=-=-=-=-=-=-=-=-=-=-  -->

    <div id="addAdmin" class="addAdmin">
        <form action="cadastrarAdmin" method="post">
            <label for="nomeAdmin">
                <input type="text" name="nomeAdmin" id="nomeAdmin" placeholder="Nome: " required>
            </label>
            <br>
            <label for="emailAdmin">
                <input type="email" name="emailAdmin" id="emailAdmin" placeholder="Email: " required>
            </label>
            <br>
            <label for="passwordAdmin">
                <input type="password" name="passwordAdmin" id="passwordAdmin" placeholder="Senha: " required>
            </label>
            <br>
            <label for="confirmPasswordAdmin">
                <input type="password" name="confirmPasswordAdmin" id="confirmPasswordAdmin" placeholder="Confirmar senha: " required>
            </label>
            <br>
            <c:if test="${not empty resultado}">
                <p>${resultado}</p>
            </c:if>

            <input type="submit" value="Adicionar Admin" class="addAdmin-inp">
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