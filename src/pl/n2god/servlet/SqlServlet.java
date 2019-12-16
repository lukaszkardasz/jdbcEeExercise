package pl.n2god.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author n2god on 16/12/2019
 * @project jdbcEeExercise
 */
@WebServlet(name = "SqlServlet", urlPatterns = "/SqlServlet")
public class SqlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("get");
	}
}
