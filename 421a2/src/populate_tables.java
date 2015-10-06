//Evan Jacques 260413259

import java.sql.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class populate_tables {
	public static void main ( String [ ] args ) throws SQLException {
        int sqlCode=0;      // Variable to hold SQLCODE
        String sqlState="00000";  // Variable to hold SQLSTATE
        Random randomizer = new Random();
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
		
		try {
			String insrtSQL = "INSERT INTO Department(did,deptName,numOfBeds) VALUES (1,\'Cardiology\',20)";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Department(did,deptName,numOfBeds) VALUES (2,\'Oncology\',50)";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Department(did,deptName,numOfBeds) VALUES (3,\'Emergency\',30)";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Department(did,deptName,numOfBeds) VALUES (4,\'Neurology\',10)";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try {
			String insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"1," +
					"1," +
					"\'John\'," +
					"'Doe'," +
					"'Nurse'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'john.doe@hospital.ca'," +
					"'heart surgery'," +
					"50," +
					"000034," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"2," +
					"1," +
					"\'Jane\'," +
					"'Doe'," +
					"'Doctor'," +
					"20031030," +
					"20150221," +
					"'f'," +
					"19851211," +
					"2345678," +
					"'jane.doe@hospital.ca'," +
					"'heart surgery'," +
					"70," +
					"000036," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"3," +
					"1," +
					"\'Bob\'," +
					"'Roberts'," +
					"'Janitor'," +
					"20011111," +
					"20150219," +
					"'m'," +
					"19801022," +
					"2345679," +
					"'bob.roberts@hospital.ca'," +
					"000045," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"4," +
					"1," +
					"\'Katie\'," +
					"'Knowles'," +
					"'Secretary'," +
					"20010831," +
					"20150223," +
					"'f'," +
					"19800712," +
					"2345687," +
					"'j.doe@hospital.ca'," +
					"000056," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"5," +
					"1," +
					"\'Dave\'," +
					"'Davids'," +
					"'Doctor'," +
					"19990315," +
					"20150220," +
					"'m'," +
					"19870712," +
					"2345697," +
					"'j.doe@hospital.ca'," +
					"'heart surgery'," +
					"90," +
					"000035," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"6," +
					"2," +
					"\'Marissa\'," +
					"'Smith'," +
					"'Nurse'," +
					"20120731," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'radiation'," +
					"30," +
					"000037," +
					"'3665 St Dominique'," +
					"'Laval'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"7," +
					"2," +
					"\'Joe\'," +
					"'Johnson'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'chemotherapy'," +
					"60," +
					"00004," +
					"'4666 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		     insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"8," +
					"2," +
					"\'Larry\'," +
					"'Mack'," +
					"'Janitor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"000078," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"9," +
					"2," +
					"\'Hilary\'," +
					"'Hill'," +
					"'Nurse'," +
					"20131031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'radiation'," +
					"20," +
					"000039," +
					"'3665 St Dominique'," +
					"'Laval'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"10," +
					"2," +
					"\'Peter\'," +
					"'Parker'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'chemotherapy'," +
					"80," +
					"000040," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"11," +
					"3," +
					"\'Bruce\'," +
					"'Wayne'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'hiv'," +
					"70," +
					"00005," +
					"'4663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"12," +
					"3," +
					"\'Clark\'," +
					"'Kent'," +
					"'Nurse'," +
					"20121031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'hiv'," +
					"40," +
					"000041," +
					"'3665 St Dominique'," +
					"'Laval'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"13," +
					"3," +
					"\'The\'," +
					"'Joker'," +
					"'Nurse'," +
					"20141031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'hiv'," +
					"30," +
					"000051," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"14," +
					"3," +
					"\'John\'," +
					"'Osterman'," +
					"'Janitor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"000198," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"15," +
					"3," +
					"\'Natalia\'," +
					"'Ramanova'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'f'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'hiv'," +
					"90," +
					"00003," +
					"'4665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"16," +
					"4," +
					"\'Walter\'," +
					"'Kovacs'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'brain surgery'," +
					"50," +
					"00002," +
					"'4664 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"17," +
					"4," +
					"\'Remy\'," +
					"'Lebeau'," +
					"'Nurse'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'brain surgery'," +
					"30," +
					"000068," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"18," +
					"4," +
					"\'Dru\'," +
					"'Zod'," +
					"'Doctor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'brain surgery'," +
					"50," +
					"00001," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"specialty," +
					"visit_fee," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"19," +
					"4," +
					"\'Raven\'," +
					"'Darkholme'," +
					"'Nurse'," +
					"20120531," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"'brain surgery'," +
					"40," +
					"000099," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Employee (" +
					"eid," +
					"did," +
					"firstName," +
					"lastName," +
					"jobTitle," +
					"startDate," +
					"lastDate," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"email," +
					"medicareNumber," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"20," +
					"4," +
					"\'Magnus\'," +
					"'Eisenhardt'," +
					"'Janitor'," +
					"20031031," +
					"20150220," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'j.doe@hospital.ca'," +
					"000176," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		
		try {
			String insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00001," +
					"\'Dru\'," +
					"'Zod'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00002," +
					"\'Walter\'," +
					"'Kovacs'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'4664 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00003," +
					"\'Natalia\'," +
					"'Ramanova'," +
					"'f'," +
					"19851212," +
					"2345678," +
					"'4665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00004," +
					"\'Joe\'," +
					"'Johnson'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'4666 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00005," +
					"\'Bruce\'," +
					"'Wayne'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'4663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00006," +
					"'Bat'," +
					"'Man'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3665 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00007," +
					"\'Super\'," +
					"'Man'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00008," +
					"\'Wonder\'," +
					"'Woman'," +
					"'f'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00009," +
					"\'Spider\'," +
					"'Man'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00010," +
					"\'Cat\'," +
					"'Woman'," +
					"'f'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00011," +
					"\'Lex\'," +
					"'Luther'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00012," +
					"\'Tony\'," +
					"'Stark'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00013," +
					"\'The\'," +
					"'Hulk'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00014," +
					"\'Sand\'," +
					"'Man'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00015," +
					"\'The\'," +
					"'Riddler'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00016," +
					"\'The\'," +
					"'Penguin'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00017," +
					"\'Doc\'," +
					"'Octopus'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00018," +
					"\'Green\'," +
					"'Goblin'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00019," +
					"\'Star\'," +
					"'Lord'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		    insrtSQL = "INSERT INTO Patient (" +
					"medicareNumber," +
					"firstName," +
					"lastName," +
					"gender," +
					"dateOfBirth," +
					"phone#," +
					"civicNumber," +
					"city," +
					"postalCode," +
					"country)" +
					" VALUES (" +
					"00020," +
					"\'I am\'," +
					"'Groot'," +
					"'m'," +
					"19851212," +
					"2345678," +
					"'3663 St Dominique'," +
					"'Montreal'," +
					"'H2X2X8'," +
					"'Canada')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		
		try{
			String insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00001," +
					"2," +
					"'Heart'," +
					"'Has Heart Problems')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1200," +
					"20150221," +
					"00002," +
					"15," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00001," +
					"5," +
					"'Heart'," +
					"'Has Heart Problems')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00003," +
					"11," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150207," +
					"00001," +
					"2," +
					"'Heart'," +
					"'Has Heart Problems')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00004," +
					"15," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00005," +
					"5," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1300," +
					"20150222," +
					"00001," +
					"2," +
					"'Heart'," +
					"'Has Heart Problems')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1000," +
					"20150121," +
					"00001," +
					"5," +
					"'Heart'," +
					"'Has Heart Problems')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"0900," +
					"20150211," +
					"00001," +
					"7," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"0800," +
					"20150219," +
					"00001," +
					"11," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00007," +
					"15," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00008," +
					"11," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00009," +
					"15," +
					"'HIV'," +
					"'Has HIV')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00001," +
					"10," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00002," +
					"7," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150203," +
					"00001," +
					"10," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00003," +
					"10," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1500," +
					"20140221," +
					"00004," +
					"14," +
					"'Brain Aneurism'," +
					"'Has Brain Aneurism')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150121," +
					"00001," +
					"2," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00011," +
					"7," +
					"'Cancer'," +
					"'Has Cancer')";
			System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
			insrtSQL = "INSERT INTO Visit (" +
					"time," +
					"date," +
					"medicareNumber," +
					"doctorID," +
					"diagnosis," +
					"medicalReport)" +
					" VALUES (" +
					"1100," +
					"20150221," +
					"00012," +
					"11," +
					"'HIV'," +
					"'Has HIV')";
		    System.out.println (insrtSQL ) ;
		    statement.executeUpdate (insrtSQL ) ;
		    System.out.println ("DONE");
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
		try{
			String querySQL = "Select date,medicareNumber,diagnosis,doctorID FROM Visit";
		    System.out.println (querySQL ) ;
		    java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    String reason;
		    ArrayList<admission> alst = new ArrayList<admission>();
		    int date;
		    int medicareNumber;
		    int eid;
		    int out;
		    while ( vs.next ( ) ) {
		    	try {
					date = vs.getInt ( 1 ) ;
					medicareNumber = vs.getInt (2);
					eid = vs.getInt(4);
					reason = vs.getString(3);
					out = date + randomizer.nextInt(5);
					admission amd = new admission(date,medicareNumber,eid,reason,date,out);
					alst.add(amd);
		    	}catch (SQLException e) {
		    		sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState + " inside");
		    	}
		    }
		    for(int i = 0; i < alst.size(); i++){
		    	admission temp = alst.get(i);
		    	int d = temp.date;
		    	int mn = temp.medicareNumber;
		    	int id = temp.eid;
		    	String r = temp.reason;
		    	int da = temp.dateAdm;
		    	int dr = temp.dateRel;
				String insrtSQL = "INSERT INTO Admission (" +
		    		"date," +
		    		"medicareNumber," +
		    		"eid," +
		    		"reasonForAdmission," +
		    		"dateAdmitted," +
		    		"dateDischarged)" +
		    		"Values" +
		    		"(" + d +
		    		"," + mn +
		    		"," + id +
		    		",'" + r +
		    		"'," + da +
		    		"," + dr + ")";
				System.out.println (insrtSQL ) ;
			    statement.executeUpdate (insrtSQL ) ;
			    System.out.println ("DONE");
		    }
		}catch (SQLException e)
	            {
	                sqlCode = e.getErrorCode(); // Get SQLCODE
	                sqlState = e.getSQLState(); // Get SQLSTATE
	                
	                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
	            }
	}
}
