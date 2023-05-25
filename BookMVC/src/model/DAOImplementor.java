package model;
import java.sql.*;
import java.util.ArrayList;
//import model.DAOProvider;
import java.util.List;

public class DAOImplementor implements DAOProvider 
{

	ResultSet rs;
	PreparedStatement pst;
	Connection con;
	CallableStatement cst;
	Book b1;
	
	public int insertdata(Book b) throws ClassNotFoundException, SQLException
	{
	  con = DBConnect.connectDB();
	  
	  pst = con.prepareStatement("insert into Book_info values(?,?,?,?)");
	  pst.setInt(1,b.getID());
	  pst.setString(2, b.getName_of_Book());
	  pst.setString(3, b.getAuthor_of_Book());
	  pst.setFloat(4, b.getPrice());
	  return (pst.executeUpdate());
	  
	}

	@Override
	public int deletedata(int ID) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		con = DBConnect.connectDB();
//		deleteQuery
		pst = con.prepareStatement("delete from Book_info where ID=?");
		pst. setInt(1,ID);
		return (pst.executeUpdate());
	}

	@Override
	public int updatedata(int ID, float Price) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		con = DBConnect.connectDB();
		
		pst = con.prepareStatement("update Book_info set Price=? where ID=?");
		pst.setFloat(1, Price);
		pst.setInt(2, ID);
		return (pst.executeUpdate());
	}

	@Override
	public int searchdata(Book b) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		con = DBConnect.connectDB();
		pst = con.prepareStatement("select * from Book_info where ID=?");
		pst.setInt(1, b.getID());
		rs = pst.executeQuery();
		while(rs.next())
		{
			b.setID(rs.getInt(1));
			b.setName_of_Book(rs.getString(2));
			b.setAuthor_of_Book(rs.getString(3));
			b.setPrice(rs.getFloat(4));
		}
		return b.ID;
	}

	public List<Book> showAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBConnect.connectDB();
		List<Book> l = new ArrayList<Book>();
		Statement s = con.createStatement();
		rs = s.executeQuery("select * from Book_info");
		while(rs.next())
		{
			b1 = new Book();
			b1.setID(rs.getInt(1));
			b1.setName_of_Book(rs.getString(2));
			b1.setAuthor_of_Book(rs.getString(3));
			b1.setPrice(rs.getFloat(4));
			l.add(b1);
		}
		return l;
	}
	
	

}
