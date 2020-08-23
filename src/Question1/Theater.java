package Question1;

public class Theater {
	
	int tid;
	String tname;
	String location;
	Movie m;
	
	
	
	public Theater(int tid, String tname, String location, Movie m) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.location = location;
		this.m = m;
	}



	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public String getTname() {
		return tname;
	}



	public void setTname(String tname) {
		this.tname = tname;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public Movie getM() {
		return m;
	}



	public void setM(Movie m) {
		this.m = m;
	}



	@Override
	public String toString() {
		return "Theater [tid=" + tid + ", tname=" + tname + ", location=" + location + ", m=" + m + "]";
	}
	
	
}
