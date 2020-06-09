package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionmanager {
	
public Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","ranjith");
		
		
		
	
		
		return con;
		
	}



}