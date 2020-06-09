package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Electrician;
import model.Plumber;
import utility.connectionmanager;

public class CheckIdPlumber {
	public int checkId(Plumber plumber, long id) throws ClassNotFoundException, SQLException {
		
		connectionmanager con=new connectionmanager();
		long id1=plumber.getId();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM PLUMBER");
		
		while(rs.next()) {
		
		
	     if(id==rs.getLong(1))
	     {
	    	 return 1;
	     }
	     
		}

		
		
		
	
		
		
		
		return 0;
}
}