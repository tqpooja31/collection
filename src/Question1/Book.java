package Question1;

public class Book {

	int bookid;
	String author;
	float price;
	
	
	public Book(int bookid, String author, float price) {
		super();
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
