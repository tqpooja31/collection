package Question1;

import java.util.Arrays;
	
public class Test {

	
	
	int tid;
	int sid;
	int marks [] ;
	
	
	public Test(int tid, int sid, int[] marks) {
		
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	

}
