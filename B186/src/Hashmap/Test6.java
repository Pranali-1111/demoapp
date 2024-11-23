package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test6 {
   
	public static void main(String[] args) {
		
		Map<Integer,String> mh=new HashMap<>();
		  mh.put(1, "Pune");
		  mh.put(2, "Mumbai");
		
		Map<Integer,String> jh=new HashMap<>();
		  jh.put(3, "Ranchi");
		  jh.put(4, "Lohardaga");
		  
		Map<Integer,Map<Integer,String>> india=new HashMap();
		  india.put(11, mh);
		  india.put(12, jh);
		  
		Set<Integer>keys=india.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int k=itr.next();
			Map<Integer,String> a= india.get(k);
			
			Set<Integer> keys2=a.keySet();
			Iterator<Integer> itr2=keys2.iterator();
			while(itr2.hasNext())
			{
				int k2=itr2.next();
				String s=a.get(k2);
				System.out.println(k2+"  "+s);
			}
		}
	}
}
