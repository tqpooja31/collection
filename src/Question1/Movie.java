package Question1;

public class Movie {

	int mid;
	String Mname;
	int rating;
	public Movie(int mid, String mname, int rating) {
		super();
		this.mid = mid;
		Mname = mname;
		this.rating = rating;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", Mname=" + Mname + ", rating=" + rating + "]";
	}
	
	
	
}
