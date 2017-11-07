package com.bridgeit.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgeit.Dao.RegisterDao;
import com.bridgeit.Model.RegisterBean;
@SuppressWarnings("serial")
@WebServlet("/RegisterServlet")
public class RegisterController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("UserName");
		String EmailId=request.getParameter("EmailId");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		String mobileNumber=request.getParameter("MobileNumber");
		RegisterBean bean = new RegisterBean();
		bean.setUserName(name);
		bean.setEmailId(EmailId);
		bean.setPassword(password);
		bean.setConfirmPassword(confirmPassword);
		bean.setMobileNumber(mobileNumber);
	    int status=RegisterDao.validate(bean);  
	    if(status>0){ 
			response.sendRedirect("process.jsp");
	    }
	    else 
	    {
	    	System.out.println("no");
	    }
	}
}
