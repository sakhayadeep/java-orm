package dao;

import java.sql.*;

public class DbConnect {
	public static Connection co = null;

	public static Connection get() throws Exception{
		if(co == null) {
			Class.forName("org.postgresql.Driver");
			co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "1");
			
		}
		//System.out.println(co);
		return co;
	}
}
