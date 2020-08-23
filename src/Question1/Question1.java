package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String args[])
	{
		ArrayList<BookSale> al=new ArrayList<BookSale>();
		al.add(new BookSale(new Book(101,"B.K",250.25f),2));
		al.add(new BookSale(new Book(102,"P.H.Naik",300.85f),5));
		al.add(new BookSale(new Book(103,"K.K.Patil",150.32f),3));
		al.add(new BookSale(new Book(104,"Y.Z.Apte",500.50f),6));
		
		
		Map<Integer,Float> mp = new HashMap<Integer,Float>();
		mp.put(1,360.56f);
		mp.put(2,480.32f);
		mp.put(101,550.10f);
		mp.put(102,110.60f);
		mp.put(103,310.60f);
		mp.put(104,600.25f);
		
		for(Map.Entry<Integer,Float> em : mp.entrySet())
		{
			for(BookSale bs : al)
			{
			   if(em.getKey() == bs.b.bookid)
			     {
				   Float update= em.getValue()+(bs.b.price * bs.CopiesSold);
				   mp.put(em.getKey(),update);
			     }
			else
			{
				mp.put(bs.b.bookid,(bs.b.price * bs.CopiesSold) );
				
			}
			   
		}
			System.out.println(em.getKey()+ " = " +em.getValue());
		
		}	
		
		
	}


}
