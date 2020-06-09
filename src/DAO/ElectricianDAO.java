package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Electrician;
import utility.connectionmanager;

public class ElectricianDAO {
	
		public int addElectrician(Electrician electrician) throws ClassNotFoundException, SQLException {
			long id=electrician.getId();
			String name=electrician.getName();
			String city=electrician.getCity();
			long mobile_number=electrician.getMobile_numer();
			System.out.println("");
			System.out.println("");
			
			System.out.println("You Have Successfully Registered With Us ");
			System.out.println("");
			System.out.println("Your Details Are:");
			System.out.println("");
			System.out.println("");
			System.out.println("ID :"+id);
			System.out.println("Name :" +name);
			System.out.println("City :" +city);
			System.out.println("Mobile_No :"+mobile_number);
			
			
			connectionmanager cm=new connectionmanager();
			
			String sql="insert into ELECTRICIAN(ID,NAME,CITY,MOBILE_NUMBER)VALUES(?,?,?,?)";
			
			PreparedStatement pt=cm.getConnection().prepareStatement(sql);
			
			pt.setLong(1, id);
			pt.setString(2, name);
			pt.setString(3, city);
			pt.setLong(4, mobile_number);

			pt.executeUpdate();
			cm.getConnection().close();
			return 0;
		}

}
