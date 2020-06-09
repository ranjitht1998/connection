package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAO.ElectricianDAO;
import DAO.PlumberDAO;
import utility.*;
import model.*;
import utility.connectionmanager;
import DAO.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
			System.out.println("");
			System.out.println("");
			System.out.println("Welcome to Connecting People");
			System.out.println("");
			System.out.println("*************************");
			
			
			
			
			int n;
			
			do {
				
				System.out.println("");
				System.out.println("");
			
				
				System.out.println("Enter The Below Options Which You Want To Do");
				System.out.println("");
				System.out.println("1.Search");
				System.out.println("");
				System.out.println("2.SignUp");
				System.out.println("");
				System.out.println("3.LogIn");
				
				System.out.println("");
				
				n=Integer.parseInt(br.readLine());
				
				
				switch(n) {
				
				
				case 1:
					System.out.println("");
					System.out.println("Choose the Below Option Based On Your Requirement");
					System.out.println("");
					System.out.println(" 1. If You Need Electrician");
					System.out.println("");
					System.out.println("2 . If You Need Plumber");
					System.out.println("");
					System.out.println("3. If You Need Servant");
					int o=Integer.parseInt(br.readLine());
					if(o==1) {
						DisplayElectrician displayelectrician=new DisplayElectrician();
						displayelectrician.display();
					}else if(o==2) {
						DisplayPlumber displayplumber=new DisplayPlumber();
						displayplumber.display();
					}
					else if(o==3) {
						DisplayServant displayservant=new DisplayServant();
						displayservant.display();
					}
					else {
						System.out.println("");
						System.out.println("Try Again And Choose The Right Option Based On The Requirement");
					}
					
					
					break;
				case 2:
					System.out.println("");
					System.out.println("Select the below options from which you belong");
					System.out.println("");
					System.out.println("1.Electrician");
					System.out.println("");
					System.out.println("2.Plumber");
					System.out.println("");
					System.out.println("3.Servant");
					System.out.println("");
					int m=Integer.parseInt(br.readLine());
					if(m==1) {
						System.out.println("Enter Your Unique Id");
						long id=Long.parseLong(br. readLine());
					
						System.out.println("Enter Your Name");
						String name=br.readLine();
						System.out.println("Enter Your City");
						String city=br.readLine();
						System.out.println("Enter Your Mobile Number");
						long mobile_number=Long.parseLong(br. readLine());
						Electrician electrician=new Electrician();
						ElectricianDAO electriciandao=new ElectricianDAO();
						electrician.setCity(city);
						electrician.setName(name);
						electrician.setId(id);
						electrician.setMobile_numer(mobile_number);
						
						
						CheckIdElectrician checkidelectrician=new CheckIdElectrician();
						int idcheck=checkidelectrician.checkId(electrician,id);
						if(idcheck==1) {
							System.out.println("");
							System.out.println("ID Already Taken By Different User");
							System.out.println("Choose Some Other ID");
						}
						else
						{
						
						electriciandao.addElectrician(electrician);
						}
						}
					else if(m==2) {
						System.out.println("Enter Your Unique Id");
						long id=Long.parseLong(br. readLine());
					
						System.out.println("Enter Your Name");
						String name=br.readLine();
						System.out.println("Enter Your City");
						String city=br.readLine();
						System.out.println("Enter Your Mobile Number");
						long mobile_number=Long.parseLong(br. readLine());
						
						Plumber plumber=new Plumber();
						PlumberDAO plumberdao=new PlumberDAO();
						plumber.setCity(city);
						plumber.setName(name);
						plumber.setId(id);
						plumber.setMobile_numer(mobile_number);
						
						CheckIdPlumber checkidplumber=new CheckIdPlumber();
						int idcheck=checkidplumber.checkId(plumber,id);
						if(idcheck==1) {
							System.out.println("");
							System.out.println("ID Already Taken By Different User");
							System.out.println("Choose Some Other ID");
						}
						else
						{
						
						plumberdao.addPlumber(plumber);
						}
						
						}
					else if(m==3) {
						System.out.println("Enter Your Unique Id");
						long id=Long.parseLong(br. readLine());
					
						System.out.println("Enter Your Name");
						String name=br.readLine();
						System.out.println("Enter Your City");
						String city=br.readLine();
						System.out.println("Enter Your Mobile Number");
						long mobile_number=Long.parseLong(br. readLine());
						
						Servant servant=new Servant();
						ServantDAO servantdao=new ServantDAO();
						
						servant.setCity(city);
						servant.setName(name);
						servant.setId(id);
						servant.setMobile_numer(mobile_number);
						
						
						CheckIdServant checkidservant=new CheckIdServant();
						int idcheck=checkidservant.checkId(servant,id);
						if(idcheck==1) {
							System.out.println("");
							System.out.println("ID Already Taken By Different User");
							System.out.println("Choose Some Other ID");
						}
						else
						{
						servantdao.addServant(servant);
						}
					}
					
					break;
				case 3:
					UpdateDAO updatedao=new UpdateDAO();
					updatedao.display();
					break;
				default:
					System.out.println("");
					System.out.println("Incorrect Option Please Try Again");
				}
				
					
			
				
			}while(n<4);
				System.out.println("Incorrect Option Please Reload Owr Portal");
	}

}
