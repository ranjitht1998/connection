package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.*;
import model.*;
import utility.*;

public class CheckIdElectrician {

		public int checkId(Electrician electrician, long id) throws ClassNotFoundException, SQLException {
			
			connectionmanager con=new connectionmanager();
			long id1=electrician.getId();
			Statement st=con.getConnection().createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM ELECTRICIAN");
			
			while(rs.next()) {
		
			
		     if(id==rs.getLong(1))
		     {
		    	 return 1;
		     }
		     
			}

			
			
			con.getConnection().close();
		
			
			
			
			return 0;
}
}
