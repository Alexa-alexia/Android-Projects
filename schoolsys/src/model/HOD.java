package model;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class HOD extends Repository {
	private final String user="HOD";
	private final String password="HOD";
	private String hodid;
	
	public HOD() throws Exception{
		//calling the super class constructor to load the database driver
		super();
		
		//creating the connection object
		this.connection=DriverManager.getConnection(this.url,this.user,this.password);
		
		//creating a statement object :should be a read-only statement and Sensitive.
		this.statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		
	}
	
	
	
	public void viewTimeTable() {
		
	}
	
	
	
	public void viewRoomAllocation() {
		
	}
	
 
	

}
