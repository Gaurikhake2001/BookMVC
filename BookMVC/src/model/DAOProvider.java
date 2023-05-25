package model;
import java.sql.*;
import java.util.List;

public interface DAOProvider {
//	public String DBDRIVER = "com.mysql.cj.jdbc.Driver";
//	public String DBURL = "jdbc:mysql://localhost:3306/bookmvc";
//	public String DBUSER = "root";
//	public String DBPASS = "root";

	
 int insertdata (Book b) throws ClassNotFoundException, SQLException;
 int deletedata (int ID) throws ClassNotFoundException, SQLException;
 int updatedata (int ID, float Price) throws ClassNotFoundException, SQLException;
 int searchdata (Book b) throws ClassNotFoundException, SQLException;
 
 public List<Book>showAll() throws ClassNotFoundException, SQLException;
}
	


