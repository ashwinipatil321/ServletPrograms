package com.bridgeit.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Dao.LoginDao;
import com.bridgeit.Model.LoginBean;

@WebServlet("/ LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultSet resultSet = null;
	String dataEmailId = null;
	String dataPassword = null;
	ServletRequest session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String inputemailId = request.getParameter("emailId");
		String inputPassword = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setEmailId(inputemailId);
		loginBean.setPassword(inputPassword);
		resultSet = LoginDao.check(loginBean);

		try {
			while (resultSet.next()) {
				dataEmailId = resultSet.getString(2);
				dataPassword = resultSet.getString(3);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (inputemailId.equals(dataEmailId) && inputPassword.equals(dataPassword)) {
			response.sendRedirect(" Home.jsp");
			session.setAttribute("dataEmailId", dataEmailId);
		} else {
			response.sendRedirect("Error.jsp");
		}
	}
}
