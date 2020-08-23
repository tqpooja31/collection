package Question1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Question20 {
	
	public static void main(String[] arg)
	{
		  List<Player> ll = new LinkedList<Player>();
		  ll.add(new Player(101,"m.s.dhoni","India","chennai super kings"));
		  ll.add(new Player(102,"David warner","Australia","Mumbai Indians"));
		  ll.add(new Player(103,"kohli","India","Royal challengres banglore"));
		  ll.add(new Player(104,"steve smith","Australia","chennai super kings"));
		  ll.add(new Player(105,"malinga","ShriLanka","Mumbai Indians"));
		  ll.add(new Player(106,"Arn finch","Australia","chennai super kings"));
		  
		  ListIterator<Player> li = null;
		  li=ll.listIterator();
		  
		  while(li.hasNext())
		  {
			  Player p = li.next();
			  if(p.getCountry().equals("Australia"))
			  {
				 
				  System.out.println(p);
			  }
			  
		  }
		  
	}

}
