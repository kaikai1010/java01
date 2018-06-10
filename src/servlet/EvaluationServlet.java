package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Evaluation;
import model.EvaluationLogic;

@WebServlet("/EvaluationServlet")
public class EvaluationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext application = this.getServletContext();
		Evaluation e = (Evaluation) application.getAttribute("e");

		if(e == null) {
			e = new Evaluation();
		}

		EvaluationLogic eLogic = new EvaluationLogic();

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if(action.equals("like")) {
			eLogic.executeLike(e);
		}
		else if(action.equals("dislike")) {
			eLogic.executeDislike(e);
		}

		application.setAttribute("e", e);

		RequestDispatcher d = request.getRequestDispatcher("/evaluationResult.jsp");
		d.forward(request, response);

	}
}
