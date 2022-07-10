package model;
import java.sql.*;

public class Repository {
	protected Connection connection;
	protected Statement statement;
	protected ResultSet results;
	protected String query;
	 
	//A single immutable database url since all connections will be made to only one database.
	final String url="jdbc:mysql://localhost:3306/SOEN305";
	
	
	public Repository() throws Exception{
		//loading the class driver;
		Class.forName("com.mysql.jdbc.Driver");
		
 	
		 
	}
	
	//a helper method used to execute a query
	protected ResultSet execute(String query) throws Exception {
		//This is a method that executes the query and returns an object of type ResultSet.
		  return this.statement.executeQuery(query);
		
	}
	
	//a helper method used to end a connection to the database.
	protected void end() throws Exception {
		//method is used to terminate connections to the database
		this.statement.close();
		this.connection.close();
		
	}
	

}
