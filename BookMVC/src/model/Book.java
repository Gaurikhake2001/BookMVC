package model;

public class Book {
	
	int ID;
	String Name_of_Book;
	String Author_of_Book;
	float Price;
	public Book()
	{
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName_of_Book() {
		return Name_of_Book;
	}
	public void setName_of_Book(String name_of_Book) {
		Name_of_Book = name_of_Book;
	}
	public String getAuthor_of_Book() {
		return Author_of_Book;
	}
	public void setAuthor_of_Book(String author_of_Book) {
		Author_of_Book = author_of_Book;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", Name_of_Book=" + Name_of_Book + ", Author_of_Book=" + Author_of_Book + ", Price="
				+ Price + "]";
	}
	
	

}
