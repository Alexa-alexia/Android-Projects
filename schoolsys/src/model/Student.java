package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//Below class is an embodiment of the student role in the database.

public class Student extends Repository {
	private String studentID; 
	private final String user="student";
	private final String password="student";
	
	
	
	
	
	
	public Student() throws Exception{
		//Super class called below loads the drivers in memory.
		super();
		
		//creating the connection object
		this.connection=DriverManager.getConnection(this.url,this.user,this.password);
		
		//creating a statement object :the result type should be a read only allowing foward cusour movement.
		this.statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
		
		
		
		
	}
	
	 
	
	
	public void getResults() throws Exception{
		 //Required to get the id of the student and use it to query the results.
			String query="";
		
		
	}
	
	public void viewTimetable() throws Exception{
		//method that allows a student to view the timetable
		
		
	}
	
	public void submitComplaint() throws Exception{
		//methos allowing a student to submit a complaint.
		
		
	}

}
