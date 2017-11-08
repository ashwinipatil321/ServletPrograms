package com.bridgeit.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgeit.Model.LoginBean;

public class LoginDao {
	
public static ResultSet check(LoginBean loginBean) {
Connection connection=null;
	ResultSet resultSet=null;
	try{
		connection = ConnectionClass.getConnection();
		PreparedStatement statement= connection.prepareStatement("select * from Register where EmailId=? and password=?");
		statement.setString(1, loginBean.getEmailId());
		statement.setString(2, loginBean.getPassword());
		resultSet=statement.executeQuery();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return resultSet;  
}

}