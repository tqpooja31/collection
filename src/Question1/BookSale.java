package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookSale {
	
	Book b;
	int CopiesSold;
	
	
	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		CopiesSold = copiesSold;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	public int getCopiesSold() {
		return CopiesSold;
	}
	public void setCopiesSold(int copiesSold) {
		CopiesSold = copiesSold;
	}
	@Override
	public String toString() {
		return "BookSale [b=" + b + ", CopiesSold=" + CopiesSold + "]";
	}
	


}
