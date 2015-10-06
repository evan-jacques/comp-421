import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class storedprocedure
{
    public static void main ( String [ ] args ) throws SQLException
    {
        int sqlCode=0;      // Variable to hold SQLCODE
        String sqlState="00000";  // Variable to hold SQLSTATE

	// Register the driver.  You must register the driver before you can use it.
        try {
	    DriverManager.registerDriver ( new com.ibm.db2.jcc.DB2Driver() ) ;
	} catch (Exception cnfe){
	    System.out.println("Class not found");
        }

	// This is the url you must use for DB2.
	//Note: This url may not valid now !
	String url = "jdbc:db2://db2:50000/cs421";
	Connection con = DriverManager.getConnection (url,"cs421g09","jeavinjos") ;
	Statement statement = con.createStatement ( ) ;
	
	
	try{
		String querySQL = "Select p_id,price,rating From Products";
		System.out.println (querySQL ) ;
		java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
	    System.out.println ("DONE");
	    while(vs.next()){
	    	int pid = vs.getInt("p_id");
	    	int rating = vs.getInt("rating");
	    	int price = vs.getInt("price");
	    	
	    	System.out.println(pid + "-" + price + "-" + rating);
	    }
	}catch (SQLException e)
    {
        sqlCode = e.getErrorCode(); // Get SQLCODE
        sqlState = e.getSQLState(); // Get SQLSTATE
        
        System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
    }
	
	
	try {
	    String procedureSQL = "Create Procedure Adjust_price_by_rating ()" +
	    		" Language SQL" +
	    		" Begin" +
	    		"	Declare p_rating double;" +
	    		"	Declare p_pid double;" +
	    		"	Declare p_price double;" +
	    		"	Declare p_rtemp double;" +
	    		"	Declare p_ptemp double;" +
	    		"	Declare at_end int default 0;" +
	    		"	Declare not_found Condition For SQLSTATE '02000';" +
	    		"  Declare C1 Cursor for" +
	    		"	  Select p_id,price,rating From Products;" +
	    		"	Declare Continue Handler for not_found Set at_end = 1;" +
	    		"	Open C1;" +
	    		"	Fetch C1 into p_pid,p_price,p_rating;" +
	    		"	While at_end = 0 DO" +
	    		"		Set p_rtemp = (p_rating - 5.0)/50;" +
	    		"		Set p_ptemp = p_price + p_price * p_rtemp;" +
	    		"		Update Products set price = p_ptemp Where p_id = p_pid;" +
	    		"		Fetch C1 into p_pid,p_price,p_rating;" +
	    		"	End While;" +
	    		"	Close C1;" +
	    		" End";
	    System.out.println (procedureSQL ) ;
	    statement.executeUpdate (procedureSQL ) ;
	    System.out.println ("DONE");
	}catch (SQLException e)
            {
                sqlCode = e.getErrorCode(); // Get SQLCODE
                sqlState = e.getSQLState(); // Get SQLSTATE
                
                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
            }
	
	try {
	    String procedureSQL = "Call Adjust_price_by_rating()";
	    System.out.println (procedureSQL ) ;
	    statement.executeUpdate (procedureSQL ) ;
	    System.out.println ("DONE");
	}catch (SQLException e)
            {
                sqlCode = e.getErrorCode(); // Get SQLCODE
                sqlState = e.getSQLState(); // Get SQLSTATE
                
                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
            }
	
	try{
		String querySQL = "Select p_id,price,rating From Products";
		System.out.println (querySQL ) ;
		java.sql.ResultSet vs = statement.executeQuery (querySQL) ;
	    System.out.println ("DONE");
	    while(vs.next()){
	    	int pid = vs.getInt("p_id");
	    	int rating = vs.getInt("rating");
	    	int price = vs.getInt("price");
	    	
	    	System.out.println(pid + "-" + price + "-" + rating);
	    }
	}catch (SQLException e)
    {
        sqlCode = e.getErrorCode(); // Get SQLCODE
        sqlState = e.getSQLState(); // Get SQLSTATE
        
        System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
    }
	
	try {
	    String procedureSQL = "Drop Procedure Adjust_price_by_rating";
	    System.out.println (procedureSQL ) ;
	    statement.executeUpdate (procedureSQL ) ;
	    System.out.println ("DONE");
	}catch (SQLException e)
            {
                sqlCode = e.getErrorCode(); // Get SQLCODE
                sqlState = e.getSQLState(); // Get SQLSTATE
                
                System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
            }
	
	statement.close ( ) ;
	con.close ( ) ;
    }
}