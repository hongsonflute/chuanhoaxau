package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
	String namedb="root";
	String passdb="123456";
	String urldb="jdbc:mysql://localhost:3306/chuanhoaxau";
	Connection cnn=null;
	
	public Connection ketnoi()
	{	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				cnn=DriverManager.getConnection(urldb, namedb, passdb);
				if(cnn!=null) {
					
					System.out.println("ket noi thanh cong!!!!!");
				}
				
				
			} catch (SQLException e) {
				
				System.out.println("loi khong ket noi duoc db" +e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("loi khong loat duoc jdbc" +e.getMessage());
		}
		
		return cnn;
	}
	
}
