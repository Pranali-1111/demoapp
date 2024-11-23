package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		          mh.add("pune");
		          mh.add("Nagpur");
		List<String> jh=new ArrayList<>();
		          jh.add("Ranchi");
		          jh.add("Lohardaga");
		List<List<String>> india=new ArrayList<>();
		          india.add(jh);
		          india.add(mh);
		          
		          for(List<String> l : india)
		          {
		        	  for(String nm:l)
		        	  {
		        		  System.out.println(nm);
		        	  }
		          }
	}

}
