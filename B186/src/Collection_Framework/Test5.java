package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {
   public static void main(String[] args) {
	
	   List<String> mh=new ArrayList<>();
	        mh.add("Pune");
	        mh.add("Mumbai");
	        mh.add("Nagpur");
	        
	   List<String> jh = new ArrayList<>();
	        jh.add("Ranchi");
	        jh.add("Lohardaga");
	      
	   List<List<String>>india=new ArrayList<>();
	        india.add(mh);
	        india.add(jh);
	        
	   Iterator <List<String>> itr= india.iterator();
	        while(itr.hasNext())
	        {
	        List<String> l=itr.next();
	        
	   Iterator<String> itr1=l.iterator();
	        while(itr1.hasNext())
	        {
	        	String value=itr1.next();
	        	System.out.println(value);
	        }
	        }
}
}
