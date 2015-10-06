//Evan Jacques 260413259

import java.sql.*;
import java.util.Scanner;


public class manipulate_tables {

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
		
		try{
			System.out.println("Question 1");
			String querySQL = "Select * From Employee Where specialty = 'heart surgery' And jobTitle = 'Doctor'";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	int eid = vs.getInt("eid");
		    	int did = vs.getInt("did");
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	String jt = vs.getString("jobTitle");
		    	int sd = vs.getInt("startDate");
		    	int ld = vs.getInt("lastDate");
		    	String g = vs.getString("gender");
		    	int dob = vs.getInt("dateOfBirth");
		    	int ph = vs.getInt("phone#");
		    	String email = vs.getString("email");
		    	String c = vs.getString("city");
		    	String sp = vs.getString("specialty");
		    	int vf = vs.getInt("visit_fee");
		    	int mn = vs.getInt("medicareNumber");
		    	System.out.println(eid + "-" + did + "-" + fn + " " + ln + "-" + jt + "-" + sd + "-" + ld + "-" + g + "-" + dob + "-" + ph + "-" + email + "-" + c + "-" + sp + "-" + vf + "-" + mn);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
		try{
			System.out.println("Question 2");
			String querySQL = "select * from employee e where e.jobTitle = 'Nurse' and e.city = 'Laval' and e.startDate > 20120601 and e.lastDate is null";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	int eid = vs.getInt("eid");
		    	int did = vs.getInt("did");
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	String jt = vs.getString("jobTitle");
		    	int sd = vs.getInt("startDate");
		    	int ld = vs.getInt("lastDate");
		    	String g = vs.getString("gender");
		    	int dob = vs.getInt("dateOfBirth");
		    	int ph = vs.getInt("phone#");
		    	String email = vs.getString("email");
		    	String c = vs.getString("city");
		    	String sp = vs.getString("specialty");
		    	int vf = vs.getInt("visit_fee");
		    	int mn = vs.getInt("medicareNumber");
		    	System.out.println(eid + "-" + did + "-" + fn + " " + ln + "-" + jt + "-" + sd + "-" + ld + "-" + g + "-" + dob + "-" + ph + "-" + email + "-" + c + "-" + sp + "-" + vf + "-" + mn);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
		try{
			System.out.println("Question 3");
			String querySQL = "Select medicalReport From Visit Where medicareNumber = 00001";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String mr = vs.getString("medicalReport");
		    	System.out.println(mr);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			System.out.println("Question 4");
			String querySQL = "select visit_fee,time,date from visit inner join employee on visit.doctorID=employee.eid where visit.medicareNumber = 00001 and visit.date > 20140601 order by date,time";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	int vf = vs.getInt("visit_fee");
		    	int t = vs.getInt("time");
		    	int d = vs.getInt("date");
		    	System.out.println(vf + "-" + t + "-" + d);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			System.out.println("Question 5");
			String querySQL = "select firstName,lastName,gender,diagnosis from patient p, visit v where v.diagnosis = 'Heart' and (select count(*) from visit where visit.medicareNumber=p.medicareNumber) > 5";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	String g = vs.getString("gender");
		    	String d = vs.getString("diagnosis");
		    	System.out.println(fn + " " + ln + "-" + g + "-" + d);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			System.out.println("Question 6");
			String querySQL = "select firstName,lastName,phone#,dateAdmitted,dateDischarged from patient inner join admission on patient.medicareNumber=admission.medicareNumber where patient.medicareNumber in (select a.medicareNumber from admission a where a.reasonForAdmission= 'HIV' intersect select a.medicareNumber from admission a where a.reasonForAdmission = 'Cancer')";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	int ph = vs.getInt("phone#");
		    	int da = vs.getInt("dateAdmitted");
		    	int dd = vs.getInt("dateDischarged");
		    	System.out.println(fn + " " + ln + "-" + ph + "-" + da + "-" + dd);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
		try{
			System.out.println("Question 7");
			String querySQL = "select firstName,lastName,phone#,dateAdmitted,dateDischarged from patient inner join admission on patient.medicareNumber=admission.medicareNumber where patient.medicareNumber in (select a.medicareNumber from admission a where a.reasonForAdmission= 'HIV' except select a.medicareNumber from admission a where a.reasonForAdmission = 'Cancer')";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	int ph = vs.getInt("phone#");
		    	int da = vs.getInt("dateAdmitted");
		    	int dd = vs.getInt("dateDischarged");
		    	System.out.println(fn + " " + ln + "-" + ph + "-" + da + "-" + dd);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
		try{
			System.out.println("Question 8");
			String querySQL = "select firstName,lastName,phone#,dateAdmitted,dateDischarged from patient inner join admission on patient.medicareNumber=admission.medicareNumber where patient.medicareNumber in (select medicareNumber from employee where employee.jobTitle = 'Doctor')";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	int ph = vs.getInt("phone#");
		    	int da = vs.getInt("dateAdmitted");
		    	int dd = vs.getInt("dateDischarged");
		    	System.out.println(fn + " " + ln + "-" + ph + "-" + da + "-" + dd);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			System.out.println("Question 10");
			String querySQL = "select firstName,lastName,jobTitle,phone# from employee where employee.medicareNumber in (select medicareNumber from admission where admission.reasonForAdmission = 'HIV')";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	String jt = vs.getString("jobTitle");
		    	int ph = vs.getInt("phone#");
		    	System.out.println(fn + " " + ln + "-" + ph + "-" + jt);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		try{
			System.out.println("Question 11");
			String querySQL = "select * from employee where employee.visit_fee in (select max(visit_fee) from employee)";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	int eid = vs.getInt("eid");
		    	int did = vs.getInt("did");
		    	String fn = vs.getString("firstName");
		    	String ln = vs.getString("lastName");
		    	String jt = vs.getString("jobTitle");
		    	int sd = vs.getInt("startDate");
		    	int ld = vs.getInt("lastDate");
		    	String g = vs.getString("gender");
		    	int dob = vs.getInt("dateOfBirth");
		    	int ph = vs.getInt("phone#");
		    	String email = vs.getString("email");
		    	String c = vs.getString("city");
		    	String sp = vs.getString("specialty");
		    	int vf = vs.getInt("visit_fee");
		    	int mn = vs.getInt("medicareNumber");
		    	System.out.println(eid + "-" + did + "-" + fn + " " + ln + "-" + jt + "-" + sd + "-" + ld + "-" + g + "-" + dob + "-" + ph + "-" + email + "-" + c + "-" + sp + "-" + vf + "-" + mn);
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
		try{
			System.out.println("Question 12");
			String querySQL = "select deptName,min(visit_fee),max(visit_fee),avg(visit_fee) from (select deptName, visit_fee from department d inner join employee e on d.did=e.did where e.jobTitle = 'Doctor') as t group by deptName";
			System.out.println (querySQL ) ;
			java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
		    System.out.println ("DONE");
		    while(vs.next()){
		    	String dn = vs.getString("deptName");
		    	int mn = vs.getInt(2);
		    	int mx = vs.getInt(3);
		    	int av = vs.getInt(4);
		    	System.out.println(dn + "-" + mn + "-" + mx + " " + av );
		    }
		}catch (SQLException e)
        {
            sqlCode = e.getErrorCode(); // Get SQLCODE
            sqlState = e.getSQLState(); // Get SQLSTATE
            
            System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
        }
		
	}
}
