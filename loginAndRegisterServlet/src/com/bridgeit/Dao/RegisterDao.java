package com.bridgeit.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.bridgeit.Model.RegisterBean;
public class RegisterDao {
	public int validate(String name,String mail,String pass,String cPass,String mobNum){  
		int count = 0;
		Connection connection=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","ninja");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into LoginAndRegister.Register values(?,?,?,?,?");
			preparedStatement.setString(1,name);
			preparedStatement.setString(2, mail);
			preparedStatement.setString(3, pass);
			preparedStatement.setString(4, cPass);
			preparedStatement.setString(5, mobNum);
			count=preparedStatement.executeUpdate();
		}
		catch(Exception e){
			
		}  
		return count;  
	}  
}  

