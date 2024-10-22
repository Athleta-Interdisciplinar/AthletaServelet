<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Athleta</title>
    <link rel="stylesheet" href="AthletaSite-main/styles/login.css">
    <link rel="shortcut icon" href="AthletaSite-main/imagens/imagem_logo_branca.png" type="image/x-icon">
</head>
<body>
    <div class="separar">
        <div class="imgem"></div>
        <content>
            <form action="login" method="post">
                <a href="index.html" class="tit">
                    <h2 class="titulo">ATHLETA</h2>
                </a><br>
                <p class="bem-vindo">BEM-VINDO DE VOLTA</p><br>
                <label for="email">
                    <input type="email" name="email" id="email" placeholder="E-mail:" required>
                </label><br>
                <label for="senha">
                    <input type="password" name="senha" id="senha" placeholder="Senha:" required>
                </label><br><br>
                <input type="submit" value="Entrar" id="entrar">
            </form>
            <a href="index.html" class="back">Voltar</a>
        </content>
    </div>
</body>
</html>