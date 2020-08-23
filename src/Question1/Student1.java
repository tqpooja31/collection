package Question1;

public class Student1 {
	
	int sid;
	int totalmarks;
	
	
	public Student1(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getTotalmarks() {
		return totalmarks;
	}


	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}


	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	
	
      
}
