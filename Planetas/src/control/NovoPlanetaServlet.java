package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Database;
import model.Planeta;

@WebServlet("/novoUsuario")
public class NovoPlanetaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomePlaneta = request.getParameter("nomePlaneta");
		String tamanhoPlaneta = request.getParameter("tamanhoPlaneta");
		String tipoPlaneta= request.getParameter("tipoPlaneta");
		String velocidadeRotacao = request.getParameter("velocidadeRotacao");
		String velocidadeTranslacao = request.getParameter("velocidadeTransl");
		String galaxia = request.getParameter("galaxia");

		Planeta planeta = new Planeta(nomePlaneta, tamanhoPlaneta, tipoPlaneta, velocidadeRotacao, velocidadeTranslacao, galaxia);
		Database.adiciona(planeta);

		request.setAttribute("planeta", planeta);
		response.sendRedirect("listaPlanetas");

	}

}
