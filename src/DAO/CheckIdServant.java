package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Electrician;
import model.Servant;
import utility.connectionmanager;

public class CheckIdServant {
	public int checkId(Servant servant, long id) throws ClassNotFoundException, SQLException {
		
		connectionmanager con=new connectionmanager();
		long id1=servant.getId();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM SERVANT");
		
		while(rs.next()) {
		
		
	     if(id==rs.getLong(1))
	     {
	    	 return 1;
	     }
	     
		}

		
		
		
	
		
		
		
		return 0;
}
}