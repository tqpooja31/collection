package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question10 {

	public static void main(String[] args) {
		
		
		List<Course> ll = new ArrayList<>();
		ll.add(new Course(1,"java"));
		ll.add(new Course(2,"angular"));
		ll.add(new Course(3,"react js"));
		ll.add(new Course(4,"node.js"));
		ll.add(new Course(5,"ML"));
		
		Map<Student3,List<Course>> hm = new HashMap<>();
		hm.put(new Student3("sanjana"),ll);
		hm.put(new Student3("pratu"),ll);
		hm.put(new Student3("komal"),ll);
		hm.put(new Student3("mayur"),ll);
		hm.put(new Student3("samir"),ll);
		
		Map<Integer,List<Student3>> hm1 = new HashMap<>();
		
		Set<Entry<Student3,List<Course>>> a = hm.entrySet();
		Iterator<Entry<Student3,List<Course>>> itr = a.iterator();
		while(itr.hasNext())
		{
			Entry<Student3,List<Course>> e = itr.next();
			Student3 snm = e.getKey();
			List<Course> c = e.getValue();
			
			Iterator<Course> it =c.iterator();
			while(it.hasNext())
			{
				Course c1 = it.next();
				if(hm1.containsKey(c1))
				{
					List<Student3> cli = hm1.get(c1);
					cli.add(snm);
					
				}
				else
				{
					ArrayList<Student3> a2 = new ArrayList<>();
					a2.add(snm);
					hm1.put(c1.cid,a2);
				}
			}
			 Iterator<Map.Entry<Integer,List<Student3>>> itr1 = hm1.entrySet().iterator(); 
	         
		        while(itr1.hasNext()) 
		        { 
		             Map.Entry<Integer,List<Student3>> entry = itr1.next(); 
		             System.out.println("Key = " + entry.getKey() +  
		                                 ", Value = " + entry.getValue()); 
		        } 
			
		}
		
		
	}

}
