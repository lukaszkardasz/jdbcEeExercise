package pl.n2god.servlet;

import pl.n2god.data.City;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author n2god on 16/12/2019
 * @project jdbcEeExercise
 */
@WebServlet(name = "SqlServlet", urlPatterns = "/SqlServlet")
public class SqlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("get");
		if ("show".equals(param)) {
			try {
				List<City> cityList = getCities();
				request.setAttribute("cityList", cityList);
				request.getRequestDispatcher("cityList.jsp").forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				response.sendError(500); //nie udało się pobrać danych
			}
		} else {
			response.sendError(403);
		}
	}

	private List<City> getCities() throws ClassNotFoundException, SQLException {
		final String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		List<City> cityList = null;
		final String dbPath = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
		final String sqlQuery = "SELECT Name, Population FROM city ORDER BY Population DESC";

		try (Connection connection = DriverManager.getConnection(dbPath, "user", "password");
		     Statement statement = connection.createStatement();
		     ResultSet resultSet = statement.executeQuery(sqlQuery)) {
			String cityName = null;
			int cityPopulation = 0;
			cityList = new ArrayList<>();
			while (resultSet.next()) {
				cityName = resultSet.getString("Name");
				cityPopulation = resultSet.getInt("Population");
				City city = new City(cityName, cityPopulation);
				cityList.add(city);
			}
			return cityList;
		}
	}
}
