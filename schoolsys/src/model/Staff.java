package model;
import java.sql.*;

public class Staff extends Repository {
	//attribute uniquely identifies a staff member
	private String staffid; 
	private final String user="staff";
	private final String password="staff";
	
	public Staff() throws Exception{
		//calling the super class constructor to load the database drivers.
		super();
		
		//creating a connection object
		this.connection=DriverManager.getConnection(url,user,password);
		
		//creating a statement object
		this.statement=this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		
		
	}
	
	  
	
	
	//method to view results of the students
	public void viewResults() {
		
	}
	
	//method to edit results of the students
	public void editResults() {
		
	}
	//method to view timetable of the students
	
	
	public void viewTimetable() {
		
	}

}
