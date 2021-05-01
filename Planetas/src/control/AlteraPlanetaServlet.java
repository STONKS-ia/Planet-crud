package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Database;
import model.Planeta;

@WebServlet("/alteraPlaneta")
public class AlteraPlanetaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nomePlaneta = request.getParameter("nomePlaneta");
		String tamanhoPlaneta = request.getParameter("tamanhoPlaneta");
		String tipoPlaneta = request.getParameter("tipoPlaneta");
		String velocidadeRotacao = request.getParameter("velocidadeRotacao");
		String velocidadeTranslacao = request.getParameter("velocidadeTransl");
		String galaxia = request.getParameter("galaxia");

		Planeta planeta = Database.buscaPlanetasID(id);

		planeta.setNome(nomePlaneta);
		planeta.setTamanho(tamanhoPlaneta);
		planeta.setTipoPlaneta(tipoPlaneta);
		planeta.setVelocidadeRotacao(velocidadeRotacao);
		planeta.setVelocidadeTranslacao(velocidadeTranslacao);
		planeta.setGalaxia(galaxia);

		response.sendRedirect("listaPlanetas");

	}

}
