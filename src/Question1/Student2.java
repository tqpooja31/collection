package Question1;

public class Student2 {
	
	int sid;
	String sname;
	String qualification;
	 int yearofpassing;
	 boolean placed;
	 
	 
	public Student2(int sid, String sname, String qualification, int yearofpassing, boolean placed) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.qualification = qualification;
		this.yearofpassing = yearofpassing;
		this.placed = placed;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getYearofpassing() {
		return yearofpassing;
	}


	public void setYearofpassing(int yearofpassing) {
		this.yearofpassing = yearofpassing;
	}


	public boolean isPlaced() {
		return placed;
	}


	public void setPlaced(boolean placed) {
		this.placed = placed;
	}


	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", qualification=" + qualification + ", yearofpassing="
				+ yearofpassing + ", placed=" + placed + "]";
	}
	 
	 

}
