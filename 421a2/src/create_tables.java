//Evan Jacques 260413259


import java.sql.*;
import java.util.Scanner;
public class create_tables {
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
		Connection con = DriverManager.getConnection (url,username,password) ;		Statement statement = con.createStatement ( ) ;
		
		try {
		    String createSQL = "CREATE TABLE Department (" +
		    		"did INTEGER NOT NULL," +
		    		" deptName VARCHAR (25) NOT NULL," +
		    		" administrator INTEGER," +
		    		" numOfBeds INTEGER," +
		    		" CONSTRAINT pk PRIMARY KEY (did)) ";
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
		    String createSQL = "CREATE TABLE Patient (" +
		    		"medicareNumber INTEGER NOT NULL," +
		    		" firstName VARCHAR (25) NOT NULL," +
		    		" lastName VARCHAR(25) NOT NULL," +
		    		" gender VARCHAR(1)," +
		    		"dateOfBirth INTEGER," +
		    		" phone# INTEGER," +
		    		" civicNumber VARCHAR(50)," +
		    		"city VARCHAR(50)," +
		    		"postalCode VARCHAR(6)," +
		    		"country VARCHAR(50)," +
		    		" CONSTRAINT pk PRIMARY KEY (medicareNumber)," +
		    		" CONSTRAINT dob CHECK (dateOfBirth < 99999999) ) ";
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
	    String createSQL = "CREATE TABLE Employee (" +
	    		"eid INTEGER NOT NULL," +
	    		" did INTEGER NOT NULL," +
	    		" firstName VARCHAR (25) NOT NULL," +
	    		" lastName VARCHAR(25) NOT NULL," +
	    		" jobTitle VARCHAR(25)," +
	    		" startDate INTEGER," +
	    		"lastDate INTEGER," +
	    		" gender VARCHAR(1)," +
	    		"dateOfBirth INTEGER," +
	    		" phone# INTEGER," +
	    		" email VARCHAR(50) ," +
	    		"specialty VARCHAR(50)," +
	    		"visit_fee INTEGER," +
	    		"medicareNumber INTEGER," +
	    		" civicNumber VARCHAR(50)," +
	    		"city VARCHAR(50)," +
	    		"postalCode VARCHAR(6)," +
	    		"country VARCHAR(50)," +
	    		" CONSTRAINT pk PRIMARY KEY (eid)," +
	    		" CONSTRAINT dob CHECK (dateOfBirth < 99999999)," +
	    		" CONSTRAINT sdate CHECK (startDate <= lastDate)) ";
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
	    String createSQL = "CREATE TABLE Admission (" +
	    		"date INTEGER NOT NULL," +
	    		" medicareNumber INTEGER NOT NULL," +
	    		" eid INTEGER NOT NULL," +
	    		" reasonForAdmission VARCHAR(255)," +
	    		" dateAdmitted INTEGER," +
	    		" dateDischarged INTEGER," +
	    		" CONSTRAINT pk PRIMARY KEY (date,medicareNumber,eid) ) ";
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
	    String createSQL = "CREATE TABLE Visit (" +
	    		"time INTEGER NOT NULL," +
	    		" date INTEGER NOT NULL," +
	    		" medicareNumber INTEGER NOT NULL," +
	    		" doctorID INTEGER NOT NULL," +
	    		"diagnosis VARCHAR(255)," +
	    		"medicalReport VARCHAR(255), " +
	    		"  CONSTRAINT pk PRIMARY KEY (time,date,medicareNumber,doctorID))";
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
	    String createSQL = "Alter TABLE Department ADD CONSTRAINT fke FOREIGN KEY (administrator) REFERENCES Employee (eid)";
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
	    String createSQL = "Alter TABLE Employee ADD CONSTRAINT fkd FOREIGN KEY (did) REFERENCES Department (did)";
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
	    String createSQL = "Alter TABLE Admission ADD CONSTRAINT fke FOREIGN KEY (eid) REFERENCES Employee (eid)";
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
	    String createSQL = "Alter TABLE Admission ADD CONSTRAINT fkm FOREIGN KEY (medicareNumber) REFERENCES Patient (medicareNumber)";
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
	    String createSQL = "Alter TABLE Visit ADD CONSTRAINT fke FOREIGN KEY (doctorID) REFERENCES Employee (eid)";
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
	    String createSQL = "Alter TABLE Visit ADD CONSTRAINT fkm FOREIGN KEY (medicareNumber) REFERENCES Patient (medicareNumber)";
	    System.out.println (createSQL ) ;
	    statement.executeUpdate (createSQL ) ;
	    System.out.println ("DONE");
	}catch (SQLException e)
            {
                sqlCode = e.getErrorCode(); // Get SQLCODE
                sqlState = e.getSQLState(); // Get SQLSTATE
                
                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
            }
	}
}
