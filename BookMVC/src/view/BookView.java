package view;
import java.awt.*;
import javax.swing.*;

import controller.BookController;

public class BookView {
	
	public JFrame f;
	public JLabel l1, l2, l3, l4;
	public JTextField t1, t2, t3, t4;
	public JButton b1, b2, b3, b4, b5;
	public TextArea a;
	
	public BookView()
	{
		f = new JFrame("Book Information"); 
		l1 = new JLabel("Book_Id ");
		t1= new JTextField();
		l2 = new JLabel("Book_Name ");
		t2= new JTextField();
		l3 = new JLabel("Book_Author ");
		t3= new JTextField();
		l4 = new JLabel("Book_Price ");
		t4= new JTextField();
		
		Font fo = new Font("Verdana", Font.BOLD,10);
		
		l1.setFont(fo);
		l2.setFont(fo);
		l3.setFont(fo);
		l4.setFont(fo);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Delete");
		b3 = new JButton("Update");
		b4 = new JButton("Search");
		
		a = new TextArea();
		b5 = new JButton("Show All");
		
		l1.setBounds(10,10,80,40);
		t1.setBounds(100,10,150,40);
		l2.setBounds(10,60,80,40);
		t2.setBounds(100,60,150,40);
		l3.setBounds(10,110,80,40);
		t3.setBounds(100,110,150,40);
		l4.setBounds(10,160,80,40);
		t4.setBounds(100,160,150,40);
		
		b1.setBounds(5,210,100,40);
		b2.setBounds(110,210,100,40);
		b3.setBounds(220,210,100,40);
		b4.setBounds(330,210,100,40);
		
		b5.setBounds(380,280,100,40);
		a.setBounds(5,260,360,150);
		
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(l4); f.add(t4);
		
		f.add(b1); f.add(b2); f.add(b3); f.add(b4); 
		
		f.add(a); f.add(b5);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		b1.addActionListener(new BookController(this));
		b2.addActionListener(new BookController(this));
		b3.addActionListener(new BookController(this));
		b4.addActionListener(new BookController(this));
		b5.addActionListener(new BookController(this));
	}
		
	

}

