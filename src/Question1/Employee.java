package Question1;

public class Employee {
	
	String ename;
	int eid;
	int mgrid;
	public Employee(String ename, int eid, int mgrid) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}
	
	

}
