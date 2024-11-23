package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		Map<Integer,String>m=new HashMap<>();
		
		  m.put(5,"Java");
		  m.put(10,"Python");
		  m.put(5,"CJC");
		  m.put(15,"Spring");
		  
		  System.out.println(m);
		  
		  
//		  Set<Integer> keys=m.keySet();
//		  System.out.println(keys);
//		  
//		  for(int k:keys)
//		  {
//			  System.out.println(k);
//			  String val=m.get(k);
//			  System.out.println(val);
//		  }
		  
//		  m.forEach((p,q)-> System.out.println(+p+ " = " +q));
	}
}
