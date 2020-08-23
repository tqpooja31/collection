package Question1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Question7  {

	public static void main(String[] args) {
		
		List<Theater> ts = new ArrayList<>();
		ts.add(new Theater(1,"city pride","pune",new Movie(101,"3 idiots",5)));
		ts.add(new Theater(2,"pvr","mumbai",new Movie(102,"dhamal",5)));
		ts.add(new Theater(3,"funtime","nashik",new Movie(103,"sultan",3)));
		ts.add(new Theater(4,"E-square","satara",new Movie(104,"dangal",6)));
		ts.add(new Theater(5,"plaza","pune",new Movie(105,"black",4)));
		
		Collections.sort(ts, new Comparator<Theater>()
				{

					@Override
					public int compare(Theater o1, Theater o2) {
					
						if(o1.getM().getRating()==o2.getM().getRating())
						{
						return o1.getTname().compareTo(o2.getTname());
						}
						else
						{
						return o1.getM().getRating()- o2.getM().getRating();
						}
					}
			
				});
		
            for(Theater th:ts)
            {
            	System.out.println(th);
            }
	

}

}
