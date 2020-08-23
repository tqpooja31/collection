package Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question19 {

	public static void main(String[] args) {
		
		
		Set<Student2> hs = new HashSet<Student2>();
		hs.add(new Student2(11,"kishor","bcs",2018,true));
		hs.add(new Student2(12,"arati","B.E",2016,false));
		hs.add(new Student2(13,"kajal","m.com",2019,true));
		hs.add(new Student2(14,"tanvi","mcs",2018,true));
		hs.add(new Student2(15,"vivek","mca",2019,false));
		hs.add(new Student2(16,"ankita","mcs",2017,true));
		hs.add(new Student2(17,"gayatri","bcs",2020,false));
		
		ArrayList<Student2> al = new ArrayList<Student2>();
		ArrayList<Student2> a2 = new ArrayList<Student2>();
		
		
		Iterator<Student2> ii =hs.iterator();
		
		while(ii.hasNext())
		{
			Student2 s = ii.next();
			if(s.placed == true)
			{
				al.add(s);
			}
			else
			{
				a2.add(s);
			}
			
		}
		
		System.out.println("/***** placed students ******/");
		for(Student2 placed :al)
		{
			System.out.println(placed);
		}
		
		System.out.println("/***** Unplaced students ******/");
		for(Student2 unplaced :a2)
		{
			System.out.println(unplaced);
		}   
	}

}
