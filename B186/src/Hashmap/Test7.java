package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test7 {
	
public static void main(String[] args) {
		
	  Map<Integer,List<String>>m=new HashMap();
	  
	  List<String>al=new ArrayList<>();
	 
	  al.add("abc");
	  al.add("pqr");
	  al.add("mnp");
	  
	  
	  
		  m.put(1, al );
		  
		  m.forEach((a,b)->{
		  System.out.println(a+"  "+b);
		  b.forEach(s ->  System.out.println(s));
		  });
		  
}
}
	
	
	
	
	
	
	
	
	
	
	


