package model;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class Admn extends Repository {
	
	private final String user="admin";
	private final String password="admin";
	

	public Admn() throws Exception {
		super(); //a call to the super class to create a connection object to the database.
		this.connection=DriverManager.getConnection(this.url,this.user,this.password);
		
		//creating a statement object :should be a read-only statement and Sensitive.
		this.statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		
	}
	
	
	
	//adding a department to the department table.
	public void writeDepartment() {
		
	}
	
	//removing department from the department table.
	public void removeDepartment() {
		
	}
	//updating the department table.
	public void updateDepartment() {
		
		
	}
	//reading data from the department table.
	public void readDepartment() {
		
	}
	
	
	
	
	
	
	
	//adding data to the staff table
	public void writeStaff() {
		
	}
	
	//removing data from the Staff table.
	public void removeStaff() {
		
	}
	//updating the Staff table.
	public void updateStaff() {
		
		
	}
	//reading data from the Staff table.
	public void readStaff() {
		
	}
	
	
	
	
	
	
	
	//adding data to the Course table
	public void writeCourse() {
		
	}
	
	//removing data from the Course table.
	public void removeCourse() {
		
	}
	//updating the Course table.
	public void updateCourse() {
		
		
	}
	//reading data from the Course table.
	public void readCourse() {
		
	}
	
	
	
	
	
	
	//adding data to the Room table
	public void writeRoom() {
		
	}
	
	//removing data from the Room table.
	public void removeRoom() {
		
	}
	//updating the Room table.
	public void updateRoom() {
		
		
	}
	//reading data from the Room table.
	public void readRoom() {
		
	}
	
	
	
	
	
	
	//adding data to the RoomAllocation table
	public void writeRoomAllocation() {
		
	}
	
	//removing data from the RoomAllocation table.
	public void removeRoomAllocation() {
		
	}
	//updating the RoomAllocation table.
	public void updateRoomAllocation() {
		
		
	}
	//reading data from the RoomAllocation table.
	public void readRoomAllocation() {
		
	}
	
	
	
	
	
	//adding data to the Results table
	public void writeResults() {
		
	}
	
	//removing data from the Results table.
	public void removeResults() {
		
	}
	//updating the Results table.
	public void updateResults() {
		
		
	}
	//reading data from the Results table.
	public void readResults() {
		
	}
	
	
	
	
	
	//adding data to the  Student table
	public void writeStudent() {
		
	}
	
	//removing data from the Student table.
	public void removeStudent() {
		
	}
	//updating the Student table.
	public void updateStudent() {
		
		
	}
	//reading data from the Student table.
	public void readStudent() {
		
	}
	
	
	 
	
	
	
	

}
