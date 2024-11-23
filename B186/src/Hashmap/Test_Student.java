package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_Student {
   
	public static void main(String[] args) {
		
		Student s1=new Student();
		
		   s1.setRollno(101);
		   s1.setName("Harry");
		   
		   Student s2=new Student();
		   
		   s2.setRollno(102);
		   s2.setName("Tom");
		   
		   Map<String,Student> m=new HashMap<>();
		      
		   m.put("aaa", s1);
		   m.put("bbb", s2);
		    
		   System.out.println(m);
		    
		   Set<String> s=m.keySet();
		   System.out.println(s);
		   
		   for(String k : s)
		   {
			   System.out.println(k);
			   Student val=m.get(k);
			   System.out.println(val.getRollno());
			   System.out.println(val.getName());
		   }
		   
//		   m.forEach((k,v) -> {
//		   System.out.println("Key = " +k);
//		   System.out.println("Value = " +v.getRollno()+ " => " +v.getName());
//		   });
	}
}
