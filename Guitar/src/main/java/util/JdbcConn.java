package util;

import java.sql.*;

public class JdbcConn {
	public static Connection getJdbcConn(){
	    try {
	    	Class.forName("org.sqlite.JDBC");
	        Connection conn = DriverManager.getConnection("jdbc:sqlite:guitar.db");        
	        return conn;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null; 
    }
}
