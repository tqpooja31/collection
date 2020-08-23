package Question1;

import java.util.ArrayList;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> a1 = new ArrayList();
		 ArrayList<Integer> a2 = new ArrayList();
		 ArrayList<Integer> a3 = new ArrayList();
		 
		    a1.add(1);
		    a1.add(2);
		    a1.add(3);
		    a1.add(4);
		    a1.add(5);
		    a1.add(6);
		     
		    a2.add(11);
		    a2.add(22);
		    a2.add(33);
		    a2.add(44);
		    
		     
		    for(int z=0;z<a2.size();z++)
		    {
		         
		        a3.add(a1.get(z));
		        a3.add(a2.get(z));
		         
		         
		    }
		    System.out.println(a3);
		    }
		 

	}


