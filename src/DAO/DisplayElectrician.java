package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.connectionmanager;

public class DisplayElectrician {

	public void display() throws ClassNotFoundException, SQLException {
		connectionmanager con=new connectionmanager();
		Statement st=con.getConnection().createStatement();
		
		ResultSet rs=st.executeQuery("SELECT * FROM ELECTRICIAN");
		System.out.println("");
		System.out.println("Id  NAME  City  MOBILE_NUMBER");
		
		while(rs.next()) {
			System.out.println("");
			
			System.out.print(rs.getLong(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getLong(4));
		}
		
		con.getConnection().close();
	}

}
