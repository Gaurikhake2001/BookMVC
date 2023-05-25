package controller;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Book;
import model.DAOImplementor;
import view.BookView;

public class BookController implements ActionListener {
	
	BookView v;
	
	public BookController(BookView v)
	{
		this.v =v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		DAOImplementor di = new DAOImplementor();
		Book b12 = new Book();
		
		if(e.getSource()==v.b1)
		{
			b12.setID(Integer.parseInt(v.t1.getText()));
			b12.setName_of_Book(v.t2.getText());
			b12.setAuthor_of_Book(v.t3.getText());
			b12.setPrice(Float.parseFloat(v.t4.getText()));
			
			int z;
			try
			{
				z= di.insertdata(b12);
				if(z>0)
				{
					JOptionPane.showMessageDialog(v.f, "Data Inserted");
				}
			}
			catch(ClassNotFoundException e1)
			{
				e1.printStackTrace();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			v.t1.setText(" ");
			v.t2.setText(" ");
			v.t3.setText(" ");
			v.t4.setText(" ");
			
		}
		
//		for 2nd button
		if(e.getSource()==v.b2)
		{
			int ID = Integer.parseInt(v.t1.getText());
			
			int z;
			try
			{
				z= di.deletedata(ID);
				if(z>0)
				{
					JOptionPane.showMessageDialog(v.f, "Data Deleted");
				}
			}
			catch(ClassNotFoundException e2)
			{
				e2.printStackTrace();
			}
			catch(SQLException e2)
			{
				e2.printStackTrace();
			}
			v.t1.setText(" ");
			
		}
		
//		for 3rd button
		
		if(e.getSource()==v.b3)
		{
			int ID = Integer.parseInt(v.t1.getText());
			float Price = Float.parseFloat(v.t4.getText());
			
			int z;
			try
			{
				System.out.println("xyz");
				z= di.updatedata(ID, Price);
				if(z>0)
				{
					JOptionPane.showMessageDialog(v.f, "Data Updated");
				}
			}
			catch(ClassNotFoundException e1)
			{
				e1.printStackTrace();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			
		}
		
//		for 4th button
		
		if(e.getSource()==v.b4)
		{
			b12.setID(Integer.parseInt(v.t1.getText()));
		int z;
				try
				{
					z = di.searchdata(b12);
					v.t1.setText(Integer.toString(b12.getID()));
					v.t2.setText(b12.getName_of_Book());
					v.t3.setText(b12.getAuthor_of_Book());
					v.t4.setText(Float.toString(b12.getPrice()));
				
				}
			
			catch(ClassNotFoundException e1)
			{
				e1.printStackTrace();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			
		}
		
		if(e.getSource() == v.b5)
		{
			List<Book> l = new ArrayList<Book>();
			try
			{
				l = di.showAll();
				for(Book b13:l)
				{
					v.a.append(b13.toString()+ "\n");
					
					}
			}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			
		}		
	}
	


