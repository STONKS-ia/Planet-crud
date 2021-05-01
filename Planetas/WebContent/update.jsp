<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="src/css/form.css" />
    <link rel="preconnect" href="https://fonts.gstatic.com" />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;800;900&display=swap"
      rel="stylesheet"
    />
    <title>Update</title>
  </head>
  <body>
    <form action="alteraPlaneta" method="post">
      <legend>Atualizar Planetas</legend>
      <input type="hidden" name="id" value='${planeta.id}' />
      <input type="text" name="nomePlaneta" value='${planeta.nome}' />
      <input type="text" name="tamanhoPlaneta" value='${planeta.tamanho}' />
      <input type="text" name="tipoPlaneta" value='${planeta.tipoPlaneta}' />
      <input type="text" name="velocidadeRotacao" value='${planeta.velocidadeRotacao}' />
      <input type="text" name="velocidadeTransl" value='${planeta.velocidadeTranslacao}' />
      <input type="text" name="galaxia" value='${planeta.galaxia}' />
      <button type="submit"> Atualizar </button>
    </form>
  </body>
</html>
