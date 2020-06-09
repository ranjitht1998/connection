package DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.connectionmanager;



public class UpdateDAO {

	public void display() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
		
		
		connectionmanager con=new connectionmanager();
		Statement st=con.getConnection().createStatement();
		
		System.out.println("");
		System.out.println("Please Enter If You Are");
		System.out.println("");
		System.out.println("1.Electrician");
		System.out.println("");
		System.out.println("2.Plumber");
		System.out.println("");
		System.out.println("3.Servant");
		
		int n=Integer.parseInt(br.readLine());
		
		if(n==1) {
			System.out.println("Select If You Want To Update Or Delete From The Option Below");
			System.out.println("");
			System.out.println("1.Delete Your Credentials From The Database");
			System.out.println("");
			System.out.println("2.Update Your City");
			System.out.println("");
			System.out.println("3.Update Your Mobile Number");
			System.out.println("");
			int m=Integer.parseInt(br.readLine());
			if(m==1) {
				System.out.println("");
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
                
	            // Deleting from database 
	            String q1 = "DELETE from electrician WHERE id = '" + id +   "' ";
	                      
	            int x = st.executeUpdate(q1); 
	              
	            if (x > 0)        
	            	
	                System.out.println("One User Successfully Deleted");             
	            else
	                System.out.println("Please Enter Your Valid Id");   
	            
	           
			}
			else if(m==2) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your City For Updation");
				String city=br.readLine();
				
				 String q1 = "UPDATE ELECTRICIAN set CITY = '" + city +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("City Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
		              
		            
			}
			else if(m==3) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your Mobile_Number For Updation");
				long mobile=Long. parseLong(br. readLine());
				
				 String q1 = "UPDATE ELECTRICIAN mobile_number = '" + mobile +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("Mobile_Number Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
			}
			else {
				System.out.println("Please Choose The Right Option");
			}
			
			
		}
		else if(n==2) {
			System.out.println("Select If You Want To Update Or Delete From The Option Below");
			System.out.println("");
			System.out.println("1.Delete Your Credentials From The Database");
			System.out.println("");
			System.out.println("2.Update Your City");
			System.out.println("");
			System.out.println("3.Update Your Mobile Number");
			System.out.println("");
			int m=Integer.parseInt(br.readLine());
			if(m==1) {
				System.out.println("");
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
                
	            // Deleting from database 
	            String q1 = "DELETE from PLUMBER WHERE id = '" + id +   "' ";
	                      
	            int x = st.executeUpdate(q1); 
	              
	            if (x > 0)        
	            	
	                System.out.println("One User Successfully Deleted");             
	            else
	                System.out.println("Please Enter Your Valid Id");   
	            
	           
			}
			else if(m==2) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your City For Updation");
				String city=br.readLine();
				
				 String q1 = "UPDATE PLUMBER set CITY = '" + city +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("City Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
		              
		            
			}
			else if(m==3) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your Mobile_Number For Updation");
				long mobile=Long. parseLong(br. readLine());
				
				 String q1 = "UPDATE PLUMBER mobile_number = '" + mobile +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("Mobile_Number Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
			}
			else {
				System.out.println("Please Choose The Right Option");
			}
			
		}
		else if(n==3) {
			System.out.println("Select If You Want To Update Or Delete From The Option Below");
			System.out.println("");
			System.out.println("1.Delete Your Credentials From The Database");
			System.out.println("");
			System.out.println("2.Update Your City");
			System.out.println("");
			System.out.println("3.Update Your Mobile Number");
			System.out.println("");
			int m=Integer.parseInt(br.readLine());
			if(m==1) {
				System.out.println("");
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
                
	            // Deleting from database 
	            String q1 = "DELETE from PLUMBER WHERE id = '" + id +   "' ";
	                      
	            int x = st.executeUpdate(q1); 
	              
	            if (x > 0)        
	            	
	                System.out.println("One User Successfully Deleted");             
	            else
	                System.out.println("Please Enter Your Valid Id");   
	            
	           
			}
			else if(m==2) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your City For Updation");
				String city=br.readLine();
				
				 String q1 = "UPDATE SERVANT set CITY = '" + city +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("City Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
		              
		            
			}
			else if(m==3) {
				System.out.println("Please Enter Your Unique_ID For Updation");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Please Enter Your Mobile_Number For Updation");
				long mobile=Long. parseLong(br. readLine());
				
				 String q1 = "UPDATE SERVANT set mobile_number = '" + mobile +  
		                    "' WHERE id = '" +id+ "'"; 
		            int x = st.executeUpdate(q1); 
		              
		            if (x > 0)             
		                System.out.println("Mobile_Number Successfully Updated");             
		            else            
		                System.out.println("Please Enter Your Valid Id"); 
			}
			else {
				System.out.println("Please Choose The Right Option");
			}
			
		}else {
			System.out.println("Please Enter the valid option");
		}
		
	}
	
	

}
