package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
	
	String s;
   public static void main(String[] args) {
	   
	Map<String,String> m=new HashMap<>();
	 
	    m.put("aaa" ,"Java");
	    m.put("bbb","Python");
	    
	    m.put("ccc", "Spring");
	    System.out.println(m);
	    
	    Set<String> s=m.keySet();
	    System.out.println(s);
	    
	    for(String k:s)
	    {
	    	System.out.println(k);
	    	String val=m.get(k);
	        System.out.println(val);
	    }
	    
	   
	   
	   
	   
}
}
