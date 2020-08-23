package Question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) {
		
		Map<Student,Integer> mp = new HashMap<Student,Integer>();
		mp.put(new Student(1,"xyz","java"),65);
		mp.put(new Student(2,"pqr","angular"), 75);
		mp.put(new Student(3,"stv","java"),45);
		mp.put(new Student(4,"lmn","angular"),60);
		mp.put(new Student(5,"abc","java"),50);
		mp.put(new Student(6,"def","angular"),23);
		
		HashSet<String> set =new HashSet<String>();
		HashSet<String> set1 =new HashSet<String>();
		
		for(Map.Entry me : mp.entrySet())
		{
			
			
		}
		
		

	}

}
