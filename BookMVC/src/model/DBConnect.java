package model;
import java.sql.*;
//import static model.DAOProvider.*;

public class DBConnect {
	
	static Connection con;
    public static Connection connectDB() throws ClassNotFoundException, SQLException
    {
//    	Class.forName("DBDRIVER");
    	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmvc","root","root");
    	return con;
    	
    }
    
}
