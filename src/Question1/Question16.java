package Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question16 {

	public static void main(String[] args) {
		
		int marks1[]= {25,50,35};
		int marks2[]= {60,85,73};
		int marks3[]= {52,45,70};
		
		
		
		ArrayList<Test> al= new ArrayList<>();
	    al.add(new Test(1,101,marks1));
	    al.add(new Test(2,102,marks2));
	    al.add(new Test(3,103,marks3));
		
	    Set<Student1> ss = new HashSet<>();
	       
	  for(Test t : al)
	  {
		  int sum=0;
		 for(int i : t.getMarks())
		 {
			 sum=sum+i; 
		 }
		 System.out.println(sum);
		
	  }
	  
	}

}
