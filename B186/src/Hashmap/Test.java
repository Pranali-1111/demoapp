package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
   public static void main(String[] args) {
	
	   Map<Integer,String>m=new HashMap<>();
	   
	      m.put(5, "Java");
	      m.put(10, "Python");
	      m.put(5, "CJC");
	      m.put(15,"Spring");
	      
	      System.out.println(m);
	      String s=m.get(5);
	   
	      m.forEach((k,v) -> System.out.println("Key = " +k+  " , Value = " +v));
}
}
