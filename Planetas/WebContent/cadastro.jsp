<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="src/css/form.css" />
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;800;900&display=swap"
	rel="stylesheet" />
<title>Cadastro</title>
</head>
<body>
 <body>
    <form action="/planetCrud/novoPlaneta" method="post">
      <legend>Cadastro de Planetas</legend>
      <input type="text" name="nomePlaneta" placeholder="Nome" />
      <input type="text" name="tamanhoPlaneta" placeholder="Tamanho" />
      <input type="text" name="tipoPlaneta" placeholder="Tipo" />
      <input type="text" name="velocidadeRotacao" placeholder="Vel.Rotação" />
      <input type="text" name="velocidadeTransl" placeholder="Vel.Translação" />
      <input type="text" name="galaxia" placeholder="Galaxia" />
      <button type="submit" name="cadastrar" value="Cadastrar">Cadastrar</button>
    </form>
  </body>

</body>
</html>