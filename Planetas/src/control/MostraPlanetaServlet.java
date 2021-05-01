package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Database;
import model.Planeta;

@WebServlet("/mostraPlaneta")
public class MostraPlanetaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		Planeta planetas = Database.buscaPlanetasID(id);
		request.setAttribute("planeta", planetas);
		RequestDispatcher rd = request.getRequestDispatcher("/update.jsp");
		rd.forward(request, response);

	}

}
