package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
   
	public static void main(String[] args) {
		 
		Map m=new HashMap();
		  m.put(1, "abc");
		  m.put('A',20.2);
		  m.put(20.5,123);
		  
		  Set keys=m.keySet();
		  Iterator itr=keys.iterator();
		  while(itr.hasNext())
		  {
		    Object k=itr.next();
		    Object s=m.get(k);
			System.out.println(k+"  "+s);
		  }
				
	}
}
