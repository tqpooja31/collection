package Question1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		lm.put("pqr",12);
		lm.put("rst",43);
		lm.put("abc",4);
		lm.put("mno",2);
		
		for(Map.Entry<String,Integer> mp : lm.entrySet())
		{
			if(mp.getKey()==mp.getKey())
			{
				
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		

	}

}
