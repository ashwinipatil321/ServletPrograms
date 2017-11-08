package com.bridgeit.service;
import java.sql.ResultSet;
import com.bridgeit.Dao.LoginDao;
import com.bridgeit.Dao.RegisterDao;
import com.bridgeit.Model.LoginBean;
import com.bridgeit.Model.RegisterBean;
public class ServiceClass {
	LoginDao loginDao=new LoginDao();
	RegisterDao registerDao= new RegisterDao();
	public ResultSet check(LoginBean loginBean) {
		ResultSet resultSet=loginDao.result(loginBean);
		return resultSet;	
	}
	public int checkStatus(RegisterBean registerBean)
	{
		int value=registerDao.register(registerBean);
		return value;
	}
}


