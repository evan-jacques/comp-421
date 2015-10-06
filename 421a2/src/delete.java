//Evan Jacques 260413259

import java.sql.*;
import java.util.Scanner;



public class delete {
	public static void main ( String [ ] args ) throws SQLException {
        int sqlCode=0;      // Variable to hold SQLCODE
        String sqlState="00000";  // Variable to hold SQLSTATE
        try {
	    DriverManager.registerDriver ( new com.ibm.db2.jcc.DB2Driver() ) ;
		} catch (Exception cnfe){
		    System.out.println("Class not found");
	        }
	
		String url = "jdbc:db2://db2:50000/cs421";
		Scanner sc = new Scanner(System.in);
		System.out.println("Username: ");
		String username = sc.nextLine();
		System.out.println("Password: ");
		String password = sc.nextLine();
		Connection con = DriverManager.getConnection (url,username,password) ;
		Statement statement = con.createStatement ( ) ;
		
		try{
			String querySQL = "delete from Admission";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "delete from Visit";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "delete from Patient";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "delete from Employee";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "delete from Department";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }/*
		try {
		    String createSQL = "Alter TABLE Department drop CONSTRAINT fke";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
		    String createSQL = "Alter TABLE Employee drop CONSTRAINT fkd";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
		    String createSQL = "Alter TABLE Admission drop CONSTRAINT fke";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
		    String createSQL = "Alter TABLE Admission drop CONSTRAINT fkm";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
		    String createSQL = "Alter TABLE Visit drop CONSTRAINT fke";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
		    String createSQL = "Alter TABLE Visit drop CONSTRAINT fkm";
		    System.out.println (createSQL ) ;
		    statement.executeUpdate (createSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }*/
		try{
			String querySQL = "drop table admission";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "drop table visit";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "drop table patient";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "drop table employee";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			String querySQL = "drop table department";
			System.out.println (querySQL ) ;
			statement.executeUpdate (querySQL) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
	}
}
