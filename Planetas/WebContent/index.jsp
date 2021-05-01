<%@page import="model.Planeta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="src/css/styles.css" />
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;800;900&display=swap"
	rel="stylesheet" />
<title>Home</title>

</head>
<body>
	<div class="listContainer">
		<c:forEach items="${planetas}" var="planeta">
			<div class="listItem">
				<form action="removePlaneta" class="headItem">
				<input type="hidden" name="id" value='${planeta.id}' >

					<%
						int num = 1 + (int) (Math.random() * 6);
					String img = "src/img/planet-" + num + ".png";
					%>

					<img id="icon" src='<%=img %>' alt="icon" />
					<p id="name">${planeta.nome}</p>
					<a id="edit" href="/planetCrud/mostraPlaneta?id=${planeta.id}"></a>
					<button type="submit" id="delete"></button>
				</form>
				<div class="bodyItem">
					<ul>
						<li>Tamanho: ${planeta.tamanho}</li>
						<li>Tipo de Planeta: ${planeta.tipoPlaneta}</li>
						<li>Velocidade de Rotacao: ${planeta.velocidadeRotacao}</li>
						<li>Velocidade de Translacao: ${planeta.velocidadeTranslacao}</li>
						<li>Galaxia: ${planeta.galaxia}</li>
					</ul>
				</div>
			</div>
		</c:forEach>
	</div>
	<a id="cadastro" href="cadastro.jsp"></a>
	<script src="src/index.js"></script>
</body>
</html>