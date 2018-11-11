package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.user;

public class userDAO {
	
	Connection cnn=null;
	DBConnection db=new DBConnection();
	PreparedStatement ptmt=null;
	ResultSet rs=null;

	public boolean addUser(user u)
	{
		cnn=db.ketnoi();
		String sql="insert into users (user_name,user_email,user_password) values(?,?,?)";
		try {
			ptmt=cnn.prepareStatement(sql);
			ptmt.setString(1, u.getUserName());
			ptmt.setString(2, u.getUserEmail());
			ptmt.setString(3, u.getUserPassword());
			ptmt.executeUpdate();
			cnn.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean checkUser(user u)
	{
		cnn=db.ketnoi();
		String sql="select*from users where user_name='"+u.getUserName()+"' and user_password='"+u.getUserPassword()+"'";
		try {
			ptmt=cnn.prepareStatement(sql);
			rs=ptmt.executeQuery();
			if(rs.next())
			{
				cnn.close();
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
