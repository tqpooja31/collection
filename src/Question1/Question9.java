package Question1;

import java.util.ArrayList;
import java.util.Iterator;

public class Question9 {
	
	public static void main(String[] args)
	{
		ArrayList<Employee> al =new ArrayList<>();
		al.add(new Employee("sakshi",1,3));
		al.add(new Employee("pavan",2,5));
		al.add(new Employee("akshada",3,1));
		al.add(new Employee("nikita",4,5));
		al.add(new Employee("payal",5,4));
		
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).mgrid == al.get(j).eid)
				{
					System.out.println(al.get(i).ename +"=" +al.get(j).ename);
				}
			}
		}
	}

}
