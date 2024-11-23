package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		
		Map<Integer,String>m=new HashMap();
		  m.put(1,"abc");
		  m.put(2,"mno");
		  m.put(3,"pqr" );
		  m.put(4, "xyz");
		  
		  m.forEach((a,b)->System.out.println(a+"  "+b)  );
	}
}
